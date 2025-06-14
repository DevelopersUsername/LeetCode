class Solution {
    public int[][] generateMatrix(int n) {

        int[][] ans = new int[n][n];
        int left = 0, right = n - 1, top = 0, bottom = n - 1, val = 1;

        while (left <= right) {
            for (int i = left; i <= right; i++) ans[top][i] = val++;
            top++;
            for (int i = top; i <= bottom; i++) ans[i][right] = val++;
            right--;
            for (int i = right; i >= left; i--) ans[bottom][i] = val++;
            bottom--;
            for (int i = bottom; i >= top; i--) ans[i][left] = val++;
            left++;
        }

        return ans;
    }
}