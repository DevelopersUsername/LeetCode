class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {

        int l = x, r = x + k - 1;
        while (l < r) {
            for (int i = y; i < y + k; i++) {
                int tmp = grid[l][i];
                grid[l][i] = grid[r][i];
                grid[r][i] = tmp;
            }

            l++;
            r--;
        }

        return grid;
    }
}