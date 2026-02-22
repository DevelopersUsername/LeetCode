class Solution {

    private static int MAX_VALUE = 50;

    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        for (int i = 0; i < ans.length; i++)
            ans[i] = findSum(nums, i, i + k - 1, x);

        return ans;
    }

    private int findSum(int[] nums, int start, int end, int x) {

        int distinctCount = 0;
        int[] frequency = new int[MAX_VALUE + 1];

        int sum = 0;
        for (int i = start; i <= end; i++) {

            if (frequency[nums[i]] == 0)
                distinctCount++;
            sum += nums[i];
            frequency[nums[i]]++;
        }

        if (distinctCount < x) return sum;

        int resultSum = 0;
        for (int selection = 0; selection < x; selection++) {
            int bestNumber = -1;
            int bestFrequency = -1;

            for (int number = MAX_VALUE; number >= 1; number--)
                if (frequency[number] > bestFrequency) {
                    bestFrequency = frequency[number];
                    bestNumber = number;
                }

            if (bestNumber != -1) {
                resultSum += bestNumber * bestFrequency;
                frequency[bestNumber] = 0;
            }
        }

        return resultSum;
    }
}