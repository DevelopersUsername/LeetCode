class Solution {
    public boolean satisfiesConditions(int[][] grid) {

        int m = grid.length, n = grid[0].length, prev = -1;

        for (int i = 0; i < n; i++) {

            int val = grid[0][i];
            if (val == prev) return false;
            for (int j = 1; j < m; j++)
                if (val != grid[j][i]) return false;

            prev = val;
        }

        return true;
    }
}