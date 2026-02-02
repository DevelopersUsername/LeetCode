class Solution {
    public int stoneGameII(int[] piles) {

        int n = piles.length;

        int[] suffix = new int[n];
        suffix[n - 1] = piles[n - 1];

        for (int i = n - 2; i >= 0; i--)
            suffix[i] = piles[i] + suffix[i + 1];

        int[][] dp = new int[n + 1][n + 1];
        for (int i = n - 1; i >= 0; i--)
            for (int j = 1; j <= n; j++)
                for (int k = 1; k <= j * 2; k++)
                    if (i + k > n) break;
                    else dp[i][j] = Math.max(dp[i][j], suffix[i] - dp[i + k][Math.max(j, k)]);

        return dp[0][1];
    }
}