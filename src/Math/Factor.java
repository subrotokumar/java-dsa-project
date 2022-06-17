package Math;

import java.util.*;

public class Factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        factor(num);
    }

    static void factor(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(0, n / i);
                }
            }
        }
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}

/*
    T(n) = O(n)
*/
