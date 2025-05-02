import java.util.Arrays;

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        for (int i = 0; i < 4; i++)
            if (Arrays.deepEquals(mat, target)) return true;
            else rotate(mat);

        return false;
    }

    private void rotate(int[][] mat) {

        int n = mat.length;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int[] temp = mat[i];
            mat[i] = mat[j];
            mat[j] = temp;
        }

        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
    }
}