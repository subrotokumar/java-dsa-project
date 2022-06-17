package Search;

import java.util.Scanner;

public class LinearSearch {

    static int search(int[] a, int k) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == k)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        s.close();
    }
}
