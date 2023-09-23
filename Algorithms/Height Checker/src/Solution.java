import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {

        int ans = 0;
        int[] t = new int[heights.length];
        System.arraycopy(heights, 0, t, 0, heights.length);
        Arrays.sort(t);

        for (int i = 0; i < heights.length; i++)
            if (heights[i] != t[i]) ans++;

        return ans;
    }
}