class Solution {

    private int val = 0;
    public int[][] specialGrid(int n) {

        int l = 1 << n;
        int[][] grid = new int[l][l];
        dfs(grid, 0, 0, l);

        return grid;
    }

    private void dfs(int[][] grid, int r, int c, int l){
        if (l == 1){
            grid[r][c] = val++;
            return;
        }

        int s = l / 2;
        dfs(grid, r, c + s, s);
        dfs(grid, r + s, c + s, s);
        dfs(grid, r + s, c, s);
        dfs(grid, r, c, s);
    }
}