class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {

        int m = mat.length, n = mat[0].length;

        int[][] ans = new int[m][n], prev = new int[m + 1][n + 1];

        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                prev[i + 1][j + 1] = mat[i][j] + prev[i][j + 1] + prev[i + 1][j] - prev[i][j];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                int r1 = Math.max(0, i - k) + 1;
                int c1 = Math.max(0, j - k) + 1;
                int r2 = Math.min(m - 1, i + k) + 1;
                int c2 = Math.min(n - 1, j + k) + 1;

                ans[i][j] = prev[r2][c2] - prev[r2][c1 - 1] - prev[r1 - 1][c2] + prev[r1 - 1][c1 - 1];
            }

        return ans;
    }
}