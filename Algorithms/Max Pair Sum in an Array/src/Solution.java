class Solution {
    public int maxSum(int[] nums) {

        int ans = -1;
        int[] max = new int[10];
        for (int num : nums) {

            int maxNumber = maxNumber(num);
            if (max[maxNumber] > 0)
                ans = Math.max(ans, num + max[maxNumber]);
            else
                max[maxNumber] = num;

            if (num > max[maxNumber])
                max[maxNumber] = num;
        }

        return ans;
    }

    private static int maxNumber(int num) {

        int max = 0;
        while (num > 0) {
            max = Math.max(max, num % 10);
            num /= 10;
        }

        return max;
    }
}