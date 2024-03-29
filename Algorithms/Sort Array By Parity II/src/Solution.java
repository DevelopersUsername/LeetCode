class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        int i = 0, j = 1, n = nums.length;

        while (i < n && j < n) {

            if (nums[i] % 2 == 0) i += 2;
            else if (nums[j] % 2 == 1) j += 2;
            else {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i += 2;
                j += 2;
            }
        }

        return nums;
    }
}