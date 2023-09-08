class Solution {
    public int sumOfSquares(int[] nums) {

        int ans = 0, m = nums.length;

        for (int i = 0; i < nums.length; i++)
            if (m % (i + 1) == 0) ans += (int) Math.pow(nums[i], 2);

        return ans;
    }
}