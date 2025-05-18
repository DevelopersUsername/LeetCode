class Solution {
    public int smallestIndex(int[] nums) {

        int sum;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 10) sum = nums[i];
            else sum = getSum(nums[i]);
            if (sum == i) return i;
        }

        return -1;
    }

    private static int getSum(int num) {

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}