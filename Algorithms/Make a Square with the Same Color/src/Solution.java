class Solution {
    public boolean canMakeSquare(char[][] grid) {

        int center = getColor(grid, 1, 1);

        int lu = center + getColor(grid, 0, 0) + getColor(grid, 0, 1) + getColor(grid, 1, 0);
        int ru = center + getColor(grid, 0, 1) + getColor(grid, 0, 2) + getColor(grid, 1, 2);
        int ld = center + getColor(grid, 1, 0) + getColor(grid, 2, 0) + getColor(grid, 2, 1);
        int rd = center + getColor(grid, 2, 1) + getColor(grid, 1, 2) + getColor(grid, 2, 2);

        return canMake(lu) || canMake(ru) || canMake(ld) || canMake(rd);
    }

    private static int getColor(char[][] grid, int row, int col) {
        return grid[row][col] == 'W' ? 1 : 0;
    }

    private static boolean canMake(int count) {
        return count >= 3 || count == 0 || count == 1;
    }
}