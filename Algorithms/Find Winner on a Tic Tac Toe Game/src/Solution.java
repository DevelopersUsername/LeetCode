class Solution {
    public String tictactoe(int[][] moves) {

        int[][] row = new int[2][3], col = new int[2][3];
        int[] d1 = new int[2], d2 = new int[2];

        for (int i = 0; i < moves.length; i++) {
            int r = moves[i][0];
            int c = moves[i][1];
            int j = i & 1;
            if (++row[j][r] == 3 || ++col[j][c] == 3 || r == c && ++d1[j] == 3 ||
                    r + c == 2 && ++d2[j] == 3)
                return j == 0 ? "A" : "B";
        }

        return moves.length == 9 ? "Draw" : "Pending";
    }
}