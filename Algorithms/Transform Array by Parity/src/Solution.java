class Solution {
    public int[] transformArray(int[] nums) {

        int count = 0;
        for (int num : nums)
            if (num % 2 == 0) count++;

        for (int i = 0; i < nums.length; i++)
            if (count-- > 0) nums[i] = 0;
            else nums[i] = 1;

        return nums;
    }
}