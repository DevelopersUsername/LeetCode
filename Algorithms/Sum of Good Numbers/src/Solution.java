class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {

        int ans = 0, n = nums.length;

        for (int i = 0; i < n; i++)
            if ((i - k < 0 || (i - k >= 0 && nums[i - k] < nums[i]))
                    && (i + k >= n || (i + k < n && nums[i + k] < nums[i])))
                ans += nums[i];

        return ans;
    }
}