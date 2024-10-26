class Solution {

    private final int[] dirsX = {1, 0, -1, 0}, dirsY = {0, 1, 0, -1};

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

        int[][] ans = new int[rows * cols][2];
        ans[0] = new int[]{rStart, cStart};

        for (int i = 0, j = 1; j < rows * cols; i++)
            for (int k = 0; k < i / 2 + 1; k++) {
                rStart += dirsY[i % 4];
                cStart += dirsX[i % 4];
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols)
                    ans[j++] = new int[]{rStart, cStart};
            }

        return ans;
    }
}