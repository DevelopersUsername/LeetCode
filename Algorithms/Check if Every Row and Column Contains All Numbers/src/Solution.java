class Solution {
    public boolean checkValid(int[][] matrix) {
        return checkRow(matrix) && checkCol(matrix);
    }

    private static boolean checkRow(int[][] matrix) {

        int m = matrix.length;
        for (int[] row : matrix) {

            boolean[] check = new boolean[m + 1];
            for (int j = 0; j < m; j++)
                if (row[j] > m) return false;
                else check[row[j]] = true;
            for (int c = 1; c < check.length; c++)
                if (!check[c]) return false;
        }

        return true;
    }

    private static boolean checkCol(int[][] matrix) {

        int n = matrix[0].length;
        for (int i = 0; i < n; i++) {

            boolean[] check = new boolean[n + 1];
            for (int[] row : matrix)
                if (row[i] > n) return false;
                else check[row[i]] = true;

            for (int c = 1; c < check.length; c++)
                if (!check[c]) return false;
        }

        return true;
    }
}