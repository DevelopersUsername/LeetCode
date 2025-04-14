class Solution {
    public int buttonWithLongestTime(int[][] events) {

        int ans = 0, prev = 0, max = 0;

        for (int[] event : events) {

            int time = event[1] - prev;
            if (time > max) {
                ans = event[0];
                max = time;
            } else if (time == max) ans = Math.min(ans, event[0]);
            prev = event[1];
        }

        return ans;
    }
}