import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqueFreq(int[] nums) {

        Map<Integer, Integer> cnt = new HashMap<>();
        for (int num : nums) cnt.merge(num, 1, Integer::sum);

        Map<Integer, Integer> freq = new HashMap<>();
        for (int v : cnt.values()) freq.merge(v, 1, Integer::sum);
        for (int num : nums)
            if (freq.get(cnt.get(num)) == 1)
                return num;

        return -1;
    }
}