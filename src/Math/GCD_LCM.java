package Math;

import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        System.out.println("GCD : "+gcd(x, y));
        System.out.println("LCM : "+lcm(x, y));
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
