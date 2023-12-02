class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int[] ans = new int[nums.length];
        int start = 0, end = nums.length - 1;

        for (int num : nums)
            if (num % 2 == 0) ans[start++] = num;
            else ans[end--] = num;

        return ans;
    }
}