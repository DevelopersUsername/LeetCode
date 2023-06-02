import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {

        int ans = 0, maxValue = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int elem : nums) {
            map.put(elem, map.getOrDefault(elem, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                ans = entry.getKey();
            }
        }

        return ans;
    }

    public int majorityElementOneLoop(int[] nums) {

        int count = 0, ans = nums[0];
        for (int num : nums) {

            if (count == 0)
                ans = num;

            if (num == ans)
                count++;
            else
                count--;
        }

        return ans;
    }
}