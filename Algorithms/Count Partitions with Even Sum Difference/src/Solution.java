class Solution {
    public int countPartitions(int[] nums) {

        int ans = 0, n = nums.length, sum = 0;
        int[] prev = new int[n], post = new int[n];

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            prev[i] = sum;
        }

        sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += nums[i];
            post[i] = sum;
        }

        for (int i = 1; i < n; i++)
            if ((prev[i - 1] - post[i]) % 2 == 0)
                ans++;

        return ans;
    }
}