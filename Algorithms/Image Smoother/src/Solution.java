class Solution {

    private static final int[][] offset = new int[][]{
            {1, 0}, {1, 1}, {0, 1}, {-1, 0}, {-1, -1}, {0, -1}, {-1, 1}, {1, -1}};

    public int[][] imageSmoother(int[][] img) {

        int m = img.length, n = img[0].length;
        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {

                int sum = img[i][j], count = 1;
                for (int[] os : offset) {
                    if (os[0] + i >= 0 && os[0] + i < m
                            && os[1] + j >= 0 && os[1] + j < n) {
                        sum += img[os[0] + i][os[1] + j];
                        count++;
                    }
                }
                ans[i][j] = sum / count;
            }

        return ans;
    }
}