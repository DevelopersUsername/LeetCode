import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findShortestSubArray(int[] nums) {

        int ans = 0, degree = 0;
        Map<Integer, Integer> debut = new HashMap<>(), count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            debut.putIfAbsent(nums[i], i);
            if (count.merge(nums[i], 1, Integer::sum) > degree) {
                degree = count.get(nums[i]);
                ans = i - debut.get(nums[i]) + 1;
            } else if (count.get(nums[i]) == degree)
                ans = Math.min(ans, i - debut.get(nums[i]) + 1);
        }

        return ans;
    }
}