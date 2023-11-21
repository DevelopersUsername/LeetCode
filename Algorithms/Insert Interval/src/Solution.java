import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> ans = new ArrayList<>();
        int index = 0;

        while (index < intervals.length && intervals[index][1] < newInterval[0]) ans.add(intervals[index++]);

        while (index < intervals.length && intervals[index][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[index][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[index++][1]);
        }

        ans.add(newInterval);

        while (index < intervals.length) ans.add(intervals[index++]);

        return ans.toArray(int[][]::new);
    }
}