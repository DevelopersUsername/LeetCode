class Solution {
    public int minimumOperations(int[][] grid) {

        int ans = 0;

        for (int i = 1; i < grid.length; i++)
            for (int j = 0; j < grid[i].length; j++)
                if (grid[i - 1][j] >= grid[i][j]) {

                    int diff = grid[i - 1][j] - grid[i][j] + 1;
                    ans += diff;
                    grid[i][j] += diff;
                }

        return ans;
    }
}