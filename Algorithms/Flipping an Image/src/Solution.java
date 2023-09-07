class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int m = image.length, n = image[0].length;
        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                ans[i][j] = image[i][m - j - 1] == 1 ? 0 : 1;

        return ans;
    }
}