class Solution {
    public int longestSubarray(int[] nums) {

        int t = 2, ans = t, n = nums.length;
        for (int i = 2; i < n; i++)
            if (nums[i] == nums[i - 1] + nums[i - 2]) ans = Math.max(ans, ++t);
            else t = 2;

        return ans;
    }
}