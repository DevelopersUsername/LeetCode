class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return getColor((coordinate1.charAt(0) - 'a') + 1, coordinate1.charAt(1) - '0')
                == getColor((coordinate2.charAt(0) - 'a') + 1, coordinate2.charAt(1) - '0');
    }

    private static int getColor(int col, int row) {

        // black - 0, white - 1
        if ((row % 2 == 0 && col % 2 == 1)
                || (row % 2 == 1 && col % 2 == 0)) return 1;
        return 0;
    }
}