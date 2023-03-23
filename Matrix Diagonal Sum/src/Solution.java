class Solution {
    public int diagonalSum(int[][] mat) {

        int ans = 0, primPos = 0, secPos = mat.length-1;
        for (int i = 0; i < mat.length; i++) {

            ans += mat[i][primPos];
            if (primPos != secPos) {
                ans += mat[i][secPos];
            }

            primPos++;
            secPos--;
        }

        return ans;
    }
}