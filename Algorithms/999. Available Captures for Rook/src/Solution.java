class Solution {
    public int numRookCaptures(char[][] board) {

        int ans = 0, ri = -1, rj = -1;
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                if (board[i][j] == 'R') {
                    ri = i;
                    rj = j;
                }

        for (int[] move : new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}})
            for (int i = ri + move[0], j = rj + move[1]; i >= 0 && i < 8 && j >= 0 && j < 8; i += move[0], j += move[1]) {
                if (board[i][j] == 'p')
                    ans++;
                if (board[i][j] != '.')
                    break;
            }

        return ans;
    }
}