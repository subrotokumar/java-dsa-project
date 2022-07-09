package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
 * Find the subArray with the given sum.
 */
public class SubarrayWithSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        findSubArrayWithSum(a,m);
    }

    static int[] findSubArrayWithSum(int[] a, int k) {
        int start = 0;
        int end = -1;
        int currentSum = 0;
        HashMap<Integer, Integer> map = new
                HashMap<>();
        for (int i = 0; i < a.length; i++) {
            currentSum += a[i];
            if (currentSum == k) {
                end = i;
                break;
            }
            if (map.containsKey(currentSum - k)) {
                start = map.get(currentSum - k) + 1;
                end = i;
                break;
            }
            map.put(currentSum, i);
        }
        if (end == -1) {
            System.out.println("Not Fount");
        } else {
            System.out.println("[" + start + ", " + end + "]");
            System.out.println(Arrays.copyOfRange(a, start, end));
        }
        return Arrays.copyOfRange(a, 0, 8);
    }
}
