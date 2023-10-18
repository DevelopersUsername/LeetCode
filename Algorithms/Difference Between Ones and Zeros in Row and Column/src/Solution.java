class Solution {
    public int[][] onesMinusZeros(int[][] grid) {

        int[] rows = new int[grid.length];
        int[] cols = new int[grid[0].length];
        int[][] ans = new int[rows.length][cols.length];

        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[i].length; j++) {
                rows[i] += grid[i][j];
                cols[j] += grid[i][j];
            }

        for (int i = 0; i < ans.length; i++)
            for (int j = 0; j < ans[i].length; j++)
                ans[i][j] = (rows[i] + cols[j]) * 2 - rows.length - cols.length;

        return ans;
    }
}