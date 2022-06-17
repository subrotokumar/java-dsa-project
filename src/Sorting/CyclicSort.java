
import java.util.Arrays;

class CyclicSort {

    private static void cyclicSort(int[] a) {
        int i = 0;
        while (i < a.length) {
            int correctIndex = a[i] - 1;            
            if (i != correctIndex) {
                int temp = a[i];
                a[i] = a[correctIndex];
                a[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }

    public static void main(String... args) {
        int a[] = {2,2,3,1}; //1 11 2 3
        cyclicSort(a);
        System.out.println(Arrays.toString(a));
    }

}