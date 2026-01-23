class Solution {
    public int maxRotateFunction(int[] nums) {


        int f = 0, sum = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            f += i * nums[i];
            sum += nums[i];
        }

        int ans = f;
        for (int i = n - 1; i >= 0; i--) {
            f += sum - nums.length * nums[i];
            ans = Math.max(ans, f);
        }

        return ans;
    }
}