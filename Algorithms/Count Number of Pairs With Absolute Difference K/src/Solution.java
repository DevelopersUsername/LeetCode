import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
    public int countKDifference(int[] nums, int k) {

        AtomicInteger ans = new AtomicInteger();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.merge(num, 1, Integer::sum);

        map.forEach((key, value) -> {

            if (map.containsKey(key + k)) {
                ans.addAndGet(value * map.get(key + k));
            }
        });

        return ans.get();
    }
}