class Solution {
    public boolean checkXMatrix(int[][] grid) {

        int n = grid.length, offsetL = 0, offsetR = n - 1;
        for (int[] row : grid) {
            for (int j = 0; j < row.length; j++)
                if (((j == offsetL || j == offsetR) && row[j] == 0)
                        || (j != offsetL && j != offsetR && row[j] != 0))
                    return false;

            offsetL++;
            offsetR--;
        }

        return true;
    }
}