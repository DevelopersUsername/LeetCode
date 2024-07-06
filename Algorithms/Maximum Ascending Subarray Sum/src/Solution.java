class Solution {
    public int maxAscendingSum(int[] nums) {

        int ans = 0, sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                ans = Math.max(ans, sum);
                sum = nums[i];
            } else sum += nums[i];
        }

        return Math.max(ans, sum);
    }
}