class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length, n = mat[0].length;
        if (m * n != r * c) return mat;

        int k = 0, l = 0;
        int[][] ans = new int[r][c];
        for (int[] ints : mat) {
            for (int j = 0; j < n; j++) {
                ans[k][l++] = ints[j];
                if (l >= c) {
                    l = 0;
                    k++;
                }
            }
        }

        return ans;
    }
}