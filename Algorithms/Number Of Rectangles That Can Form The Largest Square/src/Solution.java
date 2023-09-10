class Solution {
    public int countGoodRectangles(int[][] rectangles) {

        int ans = 0, maxLen = 0;
        for (int[] rectangle : rectangles) {

            int length = Math.min(rectangle[0], rectangle[1]);
            if (length > maxLen) {
                ans = 1;
                maxLen = Math.min(rectangle[0], rectangle[1]);
            } else if (length == maxLen) ans++;
        }

        return ans;
    }
}