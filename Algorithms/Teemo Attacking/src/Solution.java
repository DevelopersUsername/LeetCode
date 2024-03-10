class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {

        int ans = duration;
        for (int i = 1; i < timeSeries.length; i++) {
            ans += duration;
            if (timeSeries[i - 1] + duration > timeSeries[i])
                ans -= timeSeries[i - 1] + duration - timeSeries[i];
        }

        return ans;
    }
}