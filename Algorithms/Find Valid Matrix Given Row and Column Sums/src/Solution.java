class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {

        int m = rowSum.length,  n = colSum.length;
        int [][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int num = Math.min(rowSum[i], colSum[j]);
                ans[i][j] = num;
                rowSum[i] -= num;
                colSum[j] -= num;
            }
        }

        return ans;
    }
}