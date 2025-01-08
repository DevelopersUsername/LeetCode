class Solution {
    public int mostFrequent(int[] nums, int key) {

        int ans = 0, targetCount = 0;
        int[] counts = new int[1001];
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == key && ++counts[nums[i + 1]] > targetCount) {
                ans = nums[i + 1];
                targetCount = counts[nums[i + 1]];
            }

        return ans;
    }
}