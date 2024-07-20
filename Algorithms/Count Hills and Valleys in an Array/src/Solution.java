class Solution {
    public int countHillValley(int[] nums) {

        int ans = 0, prev = nums[0];

        for (int i = 1; i < nums.length - 1; i++)
            if (prev < nums[i] && nums[i] > nums[i + 1] ||
                    prev > nums[i] && nums[i] < nums[i + 1]) {
                ans++;
                prev = nums[i];
            }

        return ans;
    }
}