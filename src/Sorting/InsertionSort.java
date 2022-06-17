// package DSA.Sorting;

import java.util.Arrays;

class InsertionSort {

    private static void insertionSort(int[] a) {
        for (int i = 0; i <= a.length - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5 };
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }

}