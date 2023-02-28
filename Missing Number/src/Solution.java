class Solution {
    public int missingNumber(int[] nums) {

        int sum = nums.length;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            sum += i;
        }

        return sum - currentSum;
    }
}