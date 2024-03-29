import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        if (intervals.length == 0) return 0;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int prev = intervals[0][1];

        int ans = 0;
        for (int i = 1; i < intervals.length; ++i)
            if (intervals[i][0] >= prev) prev = intervals[i][1];
            else ans++;

        return ans;
    }
}