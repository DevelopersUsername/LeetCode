class Solution {
    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                if (dfs(board, word, i, j, 0)) return true;

        return false;
    }

    private static boolean dfs(char[][] board, String word, int row, int col, int pos) {

        if (row < 0 || row == board.length
                || col < 0 || col == board[0].length) return false;
        if (board[row][col] != word.charAt(pos) || board[row][col] == '-') return false;
        if (pos == word.length() - 1) return true;

        char temp = board[row][col];
        board[row][col] = '-';
        boolean isExist = dfs(board, word, row + 1, col, pos + 1)
                || dfs(board, word, row - 1, col, pos + 1)
                || dfs(board, word, row, col + 1, pos + 1)
                || dfs(board, word, row, col - 1, pos + 1);
        board[row][col] = temp;

        return isExist;
    }
}