class Solution {
    public int differenceOfSum(int[] nums) {

        int elemSum = 0, digitSum = 0;

        for (int num : nums) {

            elemSum += num;
            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }
        }

        return elemSum - digitSum;
    }
}