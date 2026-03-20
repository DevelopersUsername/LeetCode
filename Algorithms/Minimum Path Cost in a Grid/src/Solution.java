class Solution {
    public int minPathCost(int[][] grid, int[][] moveCost) {

        int ans = Integer.MAX_VALUE, m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];

        System.arraycopy(grid[0], 0, dp[0], 0, n);

        for (int i = 1; i < m; i++)
            for (int j = 0; j < n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = 0; k < n; k++)
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + moveCost[grid[i - 1][k]][j] + grid[i][j]);
            }

        for (int i = 0; i < n; i++)
            ans = Math.min(ans, dp[m - 1][i]);

        return ans;
    }
}