class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {

        int len = s.length();
        int[] ans = new int[len];
        int row, col, count;

        for (int i = 0; i < len; i++) {
            row = startPos[0];
            col = startPos[1];
            count = 0;

            for (int j = i; j < len; j++) {
                char move = s.charAt(j);
                if (move == 'U') row--;
                else if (move == 'D') row++;
                else if (move == 'L') col--;
                else col++;
                if (row < 0 || col < 0 || row >= n || col >= n) break;
                count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}