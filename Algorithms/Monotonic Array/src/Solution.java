class Solution {
    public boolean isMonotonic(int[] nums) {

        boolean flag1 = true, flag2 = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) flag1 = false;
            else if (nums[i - 1] < nums[i]) flag2 = false;
        }

        return flag1 || flag2;
    }
}