class Solution {
    public int maximizeSum(int[] nums, int k) {

        int ans = 0, maxValue = 0, maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < k; i++) {
            ans += nums[maxIndex]++;
        }

        return ans;
    }
}