class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {

        int n = nums.length, maximumXor = (1 << maximumBit) - 1, xors = 0;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            xors ^= nums[i];
            ans[n - 1 - i] = xors ^ maximumXor;
        }

        return ans;
    }
}