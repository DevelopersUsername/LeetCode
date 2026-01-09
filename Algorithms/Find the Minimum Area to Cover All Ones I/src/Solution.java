class Solution {
    public int minimumArea(int[][] grid) {

        int minX = 1001, maxX = 0, minY = 1001, maxY = 0;
        for (int y = 0; y < grid.length; y++) {

            boolean flag = false;
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == 1) {
                    flag = true;
                    minX = Math.min(minX, x);
                    maxX = Math.max(maxX, x);

                }
            }

            if (flag) {
                minY = Math.min(minY, y);
                maxY = Math.max(maxY, y);
            }
        }

        return (++maxX - minX) * (++maxY - minY);
    }
}