class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] ans = new int[nums.length];
        int num1, num2, start = 0, end = nums.length - 1, l = nums.length - 1;

        while (start <= end) {

            num1 = (int) Math.pow(nums[start], 2);
            num2 = (int) Math.pow(nums[end], 2);

            if (num1 < num2) {
                ans[l--] = num2;
                end--;
            } else {
                ans[l--] = num1;
                start++;
            }
        }

        return ans;
    }
}