import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findPairs(int[] nums, int k) {

        int ans = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], i);

        for (int i = 0; i < nums.length; i++) {
            int target = nums[i] + k;
            if (map.containsKey(target) && map.get(target) != i) {
                ans++;
                map.remove(target);
            }
        }

        return ans;
    }
}