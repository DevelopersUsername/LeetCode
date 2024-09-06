class Solution {
    public boolean checkStraightLine(int[][] coordinates) {

        if (coordinates.length == 2) return true;

        int x0 = coordinates[0][0], y0 = coordinates[0][1],
                dx = coordinates[1][0] - x0, dy = coordinates[1][1] - y0;

        for (int i = 2; i < coordinates.length; i++)
            if ((coordinates[i][0] - x0) * dy != (coordinates[i][1] - y0) * dx)
                return false;

        return true;
    }
}