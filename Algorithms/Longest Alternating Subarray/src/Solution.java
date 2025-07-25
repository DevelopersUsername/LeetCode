class Solution {
    public int alternatingSubarray(int[] nums) {

        int ans = 1, count = 1;

        for (int i = 1; i < nums.length; i++) {
            int diff = count % 2 == 0 ? -1 : 1;
            if (nums[i] - nums[i - 1] == diff) count++;
            else if (nums[i] - nums[i - 1] == 1) count = 2;
            else count = 1;
            ans = Math.max(ans, count);
        }

        return ans == 1 ? -1 : ans;
    }
}