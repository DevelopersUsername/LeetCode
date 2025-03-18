class Solution {
    public int[] findErrorNums(int[] nums) {

        int[] ans = new int[2];
        int d = 0;

        for (int num : nums)
            if (nums[Math.abs(num) - 1] < 0)
                d = Math.abs(num);
            else
                nums[Math.abs(num) - 1] *= -1;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] > 0)
                return new int[]{d, i + 1};

        return ans;
    }
}