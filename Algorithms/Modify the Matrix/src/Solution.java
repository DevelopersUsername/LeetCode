class Solution {

    private static int max;

    public int[][] modifiedMatrix(int[][] matrix) {

        for (int i = 0; i < matrix[0].length; i++)
            if (findMax(matrix, i))
                replace(matrix, i, max);

        return matrix;
    }

    private boolean findMax(int[][] matrix, int i) {

        max = -1;
        boolean mod = false;
        for (int[] col : matrix) {
            max = Math.max(max, col[i]);
            if (col[i] == -1)
                mod = true;
        }

        return mod;
    }

    private static void replace(int[][] matrix, int i, int val) {
        for (int j = 0; j < matrix.length; j++)
            if (matrix[j][i] == -1)
                matrix[j][i] = val;
    }
}