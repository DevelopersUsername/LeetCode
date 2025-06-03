class Solution {
    public int minOperations(int[] nums) {

        int ans = 0, n = nums.length;

        for (int i = 0; i < n - 2; i++)
            if (nums[i] == 0) {
                ans++;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
            }

        return nums[n - 1] == 0 || nums[n - 2] == 0 ? -1 : ans;
    }
}