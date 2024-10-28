import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestSquareStreak(int[] nums) {

        int ans = 0, count = 0;

        Set<Long> set = new HashSet<>();
        for (int num : nums)
            set.add((long) num);

        for (long num : set) {

            long t = num;
            while (set.contains(t)) {
                t *= t;
                count++;
            }

            ans = Math.max(ans, count);
            count = 0;
        }

        return ans == 1 ? -1 : ans;
    }
}