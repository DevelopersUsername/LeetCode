class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length, n = mat[0].length, d = 1, row = 0, col = 0;
        int[] ans = new int[m * n];

        for (int i = 0; i < m * n; ++i) {
            ans[i] = mat[row][col];
            row -= d;
            col += d;
            if (row == m) {
                row = m - 1;
                col += 2;
                d = -d;
            }
            if (col == n) {
                col = n - 1;
                row += 2;
                d = -d;
            }
            if (row < 0) {
                row = 0;
                d = -d;
            }
            if (col < 0) {
                col = 0;
                d = -d;
            }
        }

        return ans;
    }
}