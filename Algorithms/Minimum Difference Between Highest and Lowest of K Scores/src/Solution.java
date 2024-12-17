import java.util.Arrays;

class Solution {
    public int minimumDifference(int[] nums, int k) {

        if (k < 2 || nums.length < 2) return 0;

        int ans = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0; i <= nums.length - k; i++)
            ans = Math.min(ans, nums[i + k - 1] - nums[i]);

        return ans;
    }
}