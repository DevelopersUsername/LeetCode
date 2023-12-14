import java.util.*;

class Solution {
    public List<Integer> minSubsequence(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        int sum = 0, seqSum = 0;
        for (int num : nums) sum += num;

        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            seqSum += nums[i];
            sum -= nums[i];
            ans.add(nums[i]);
            if (seqSum > sum) break;
        }

        return ans;
    }
}