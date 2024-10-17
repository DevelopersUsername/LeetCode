class Solution {
    public int minimumCost(int[] nums) {

        int ans = nums[0], min1 = nums[1], min2 = nums[2];

        for (int i = 3; i < nums.length; i++)

            if (nums[i] < min1 || nums[i] < min2) {
                min1 = Math.min(min1, min2);
                min2 = nums[i];
            }

        return ans + min1 + min2;
    }
}