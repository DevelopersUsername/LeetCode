class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {

        int[] ans = new int[nums.length],
                prefix = new int[nums.length],
                suffix = new int[nums.length];

        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            prefix[i] = prefix[i - 1] + nums[i];

        suffix[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--)
            suffix[i] = suffix[i + 1] + nums[i];

        for (int i = 0; i < nums.length; ++i)
            ans[i] = nums[i] * (i + 1) - prefix[i] + suffix[i] - nums[i] * (nums.length - i);

        return ans;
    }
}