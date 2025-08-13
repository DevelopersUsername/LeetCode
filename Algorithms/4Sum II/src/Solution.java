import java.util.HashMap;
import java.util.Map;

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        int ans = 0, n = nums1.length;
        Map<Integer, Integer> count = new HashMap<>();

        for (int i : nums1)
            for (int j : nums2)
                count.merge(i + j, 1, Integer::sum);


        for (int i : nums3)
            for (int j : nums4)
                ans += count.getOrDefault(-i - j, 0);

        return ans;
    }
}