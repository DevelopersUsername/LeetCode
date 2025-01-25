class Solution {
    public int maxAdjacentDistance(int[] nums) {

        int ans = 0;
        for (int i = 1; i < nums.length; i++)
            ans = Math.max(ans, Math.abs(nums[i] - nums[i - 1]));

        if (nums.length > 2)
            ans = Math.max(ans, Math.abs(nums[0] - nums[nums.length - 1]));

        return ans;
    }
}