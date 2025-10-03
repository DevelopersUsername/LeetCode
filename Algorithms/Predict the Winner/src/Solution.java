import java.util.Arrays;

class Solution {
    public boolean predictTheWinner(int[] nums) {

        int n = nums.length;
        int[] dp = Arrays.copyOf(nums, n);

        for (int i = 1; i < n; i++)
            for (int j = n - 1; j - i >= 0; j--)
                dp[j] = Math.max(nums[j - i] - dp[j], nums[j] - dp[j - 1]);

        return dp[n - 1] >= 0;
    }
}