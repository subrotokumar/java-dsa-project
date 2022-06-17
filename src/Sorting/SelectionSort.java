// package DSA.Sorting;

import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int[] a) {
        int minIndex;
        for (int i = 0; i < a.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            int t = a[i];
            a[i] = a[minIndex];
            a[minIndex] = t;
        }
    }

    public static void main(String[] args) {
        int a[] = { 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5 };
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}