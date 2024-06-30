class Solution {
    public int minimumSum(int[] nums) {

        int ans = Integer.MAX_VALUE;

        int[] pref = new int[nums.length], suf = new int[nums.length];
        pref[0] = nums[0];
        suf[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; ++i)
            pref[i] = Math.min(pref[i - 1], nums[i]);

        for (int i = nums.length - 2; i >= 0; --i)
            suf[i] = Math.min(suf[i + 1], nums[i]);

        for (int i = 0; i < nums.length; ++i)
            if (nums[i] > pref[i] && nums[i] > suf[i])
                ans = Math.min(ans, pref[i] + nums[i] + suf[i]);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}