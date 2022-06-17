package Math;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        System.out.println(squareRoot(num, 3));
    }

    static double squareRoot(int n, double p) {
        int start = 0;
        int end = n;

        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        double root = mid - 1;
        double increment = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += increment;
            }
            root -= increment;
            increment /= 10;
        }
        return root;
    }
}

/*
    Time Complexity :
        T(n) = log n
 */