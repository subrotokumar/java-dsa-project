package Search;

import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int[] a, int k) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (k == a[mid])
                return mid;
            else if (k < a[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("N : ");
        int n = s.nextInt();
        int[] a = new int[n];

        System.out.print("Array[] : ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.print("Find : ");
        int target = s.nextInt();
        System.out.println("Position : "+binarySearch(a, target));

        s.close();
    }
}