import java.util.Arrays;

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {

        int ans = 0;
        int[] t = new int[points.length];

        for (int i = 0; i < points.length; i++) t[i] = points[i][0];

        Arrays.sort(t);
        for (int i = 1; i < t.length; i++) ans = Math.max(ans, t[i] - t[i - 1]);

        return ans;
    }
}