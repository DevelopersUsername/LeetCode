import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int findMinArrowShots(int[][] points) {

        if (points.length == 0) return 0;

        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int ans = 1;

        int[] prev = points[0];
        for (int i = 1; i < points.length; i++) {

            if (prev[1] < points[i][0]) {
                prev = points[i];
                ans++;
            }
        }

        return ans;
    }
}