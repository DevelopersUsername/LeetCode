import java.util.List;

class Solution {
    public int findMinDifference(List<String> timePoints) {

        int ans = 24 * 60, start = ans;
        boolean[] visited = new boolean[24 * 60];

        for (String timePoint : timePoints) {
            int time = Integer.parseInt(timePoint.substring(0, 2)) * 60
                    + Integer.parseInt(timePoint.substring(3));
            start = Math.min(start, time);
            if (visited[time]) return 0;
            visited[time] = true;
        }

        int prev = start;
        for (int i = start + 1; i < visited.length; i++)
            if (visited[i]) {
                ans = Math.min(ans, i - prev);
                prev = i;
            }

        return Math.min(ans, 24 * 60 - prev + start);
    }
}