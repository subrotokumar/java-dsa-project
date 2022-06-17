package Sorting;
import java.util.Arrays;

class BubbleSort {

    static void bubbleSort(int a[]) {
        int len = a.length;
        boolean swapped;
        for (int i = 0; i < len; i++) {
            swapped = false;
            for (int j = 0; j < len - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int a[] = {10, 23, 54, 12, -7, 0, -43, 56};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

}