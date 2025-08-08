class Solution {

    private final double[][] dp = new double[200][200];

    public double soupServings(int n) {
        return n > 4800 ? 1 : dfs((n + 24) / 25, (n + 24) / 25);
    }

    private double dfs(int i, int j) {
        if (i <= 0 && j <= 0) return 0.5;
        else if (i <= 0) return 1.0;
        else if (j <= 0) return 0;
        else if (dp[i][j] > 0) return dp[i][j];
        else dp[i][j] = 0.25 * (dfs(i - 4, j) + dfs(i - 3, j - 1) + dfs(i - 2, j - 2) + dfs(i - 1, j - 3));

        return dp[i][j];
    }
}