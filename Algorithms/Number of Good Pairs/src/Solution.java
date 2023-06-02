import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {

        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            if (map.containsKey(num))
                ans += map.get(num);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return ans;
    }
}