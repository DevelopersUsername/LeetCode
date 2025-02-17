class Solution {
    public int subarraySum(int[] nums) {

        int ans = nums[0];
        for (int i = 1; i < nums.length; i++)
            for (int j = Math.max(0, i - nums[i]); j <= i; j++)
                ans += nums[j];

        return ans;
    }
}