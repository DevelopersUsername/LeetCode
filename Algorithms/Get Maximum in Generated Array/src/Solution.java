class Solution {
    public int getMaximumGenerated(int n) {

        if (n < 2) return n;

        int[] nums = new int[n + 1];
        nums[1] = 1;

        int ans = 0;
        for (int i = 2; i <= n; i++) {
            nums[i] = i % 2 == 0 ? nums[i / 2] : nums[i / 2] + nums[i / 2 + 1];
            ans = Math.max(ans, nums[i]);
        }

        return ans;
    }
}