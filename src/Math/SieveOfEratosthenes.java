package Math;

import java.util.*;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        boolean[] isPrime = sieve(num);

        for (int i = 1; i <= num; i++) {
            System.out.println(i + " " + isPrime[i]);
        }

        scanner.close();
    }

    static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (!isPrime[i]) continue;
            for (int j = 2 * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
}

/*
    Time Complexity Analysis :

    For given input n,

        T(n) = n/2 + n/3+ n/7 + ...
             = n ( 1/2 + 1/3 + 1/5 + 1/7 + ...)     // Harmonic Progression for Prime
             = n * log(log n)
 */
