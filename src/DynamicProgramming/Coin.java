/*
 * F
 */
package DynamicProgramming;

import java.util.Arrays;

public class Coin {
    public static void main(String[] args) {
        int k = 18;
        int coins[] = {1, 5, 7};
        int dp[] = new int[k + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        int ans = minCoin(coins, k, dp);

        for(int i:dp) {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println(ans);
    }

    static int minCoin(int[] a, int k, int[] dp) {
        if (k == 0) return 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (k >= a[i]) {
                int subAns = 0;
                if (dp[k - a[i]] != -1) {
                    subAns = dp[k - a[i]];
                } else {
                    subAns = minCoin(a, k - a[i], dp);
                }
                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }
        }
        return dp[k]=ans;
    }
}
