class Solution {

    private int ans = 0;

    public int countMaxOrSubsets(int[] nums) {

        int max = 0;
        for (int num : nums) max |= num;
        dfs(nums, max, 0, 0);

        return ans;
    }

    private void dfs(int[] nums, int max, int index, int sum) {

        if (index == nums.length) {
            if (sum == max) ans++;
            return;
        }

        dfs(nums, max, index + 1, sum);
        dfs(nums, max, index + 1, sum | nums[index]);
    }
}