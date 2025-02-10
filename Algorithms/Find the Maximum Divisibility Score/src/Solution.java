class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {

        int ans = -1, maxCount = -1, count = -1;

        for (int divisor : divisors) {

            count = getCount(nums, divisor);
            if (count > maxCount) {
                maxCount = count;
                ans = divisor;
            } else if (count == maxCount)
                ans = Math.min(ans, divisor);
        }

        return ans;
    }

    private static int getCount(int[] nums, int divisor) {

        int count = 0;

        for (int num : nums)
            if (num % divisor == 0)
                count++;


        return count;
    }
}