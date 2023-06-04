class Solution {
    public int[][] largestLocal(int[][] grid) {

        int[][] maxLocal = new int[grid.length - 2][grid.length - 2];

        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[i].length - 1; j++) {

                int maxValue = 0;
                for (int k = -1; k < 2; k++) {
                    for (int l = -1; l < 2; l++) {
                        maxValue = Math.max(grid[i + k][j + l], maxValue);
                    }
                }

                maxLocal[i - 1][j - 1] = maxValue;
            }
        }

        return maxLocal;
    }
}