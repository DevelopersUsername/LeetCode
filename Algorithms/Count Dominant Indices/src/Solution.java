class Solution {
    public int dominantIndices(int[] nums) {

        int ans = 0, sum = 0, n = nums.length;
        double[] avg = new double[n];

        for (int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
            avg[i] = (double) sum / (n - i);
        }

        for (int i = 0; i < n - 1; i++)
            if (nums[i] > avg[i + 1])
                ans++;

        return ans;
    }
}