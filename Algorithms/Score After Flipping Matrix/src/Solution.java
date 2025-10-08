class Solution {
    public int matrixScore(int[][] grid) {

        int m = grid.length, n = grid[0].length, ans = m;

        for (int i = 1; i < n; i++) {
            int count = 0;
            for (int[] ints : grid) count += ints[i] == ints[0] ? 1 : 0;
            ans = ans * 2 + Math.max(count, m - count);
        }

        return ans;
    }
}