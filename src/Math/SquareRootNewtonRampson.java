/*
    According to Newton-Rampson,

         root = 0.5 * (x + n / x)

         where,  x is guess root
*/

package Math;

import java.util.Scanner;

public class SquareRootNewtonRampson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        System.out.println(squareRoot(num, 3));
    }

    static double squareRoot(int n, double p) {
        double x = n;
        while (true) {
            double root = 0.5 * (x + n / x);

            if (Math.abs(root - x) < 0.5) {
                return root;
            }
            x = root;
        }
    }
}

/*
    Time Complexity :
        T(n) = O( log n * F(n) )

        where, F(n) = cost of calculating f(n) with n-digit precision.
 */