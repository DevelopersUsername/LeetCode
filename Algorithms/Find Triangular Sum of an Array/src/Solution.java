class Solution {
    public int triangularSum(int[] nums) {

        if (nums.length == 1) return nums[0];

        int end = nums.length;
        while (end > 1) {
            for (int i = 0; i < end - 1; i++)
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            end--;
        }

        return nums[0];
    }
}