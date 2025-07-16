    class Solution {
        public int maximumLength(int[] nums) {

            int ans = 0;
            int[][] dp = new int[2][2];

            for (int x : nums)
                for (int y = 0; y < 2; y++)
                    dp[x % 2][y] = dp[y][x % 2] + 1;

            for (int[] row : dp)
                for (int freq : row)
                    ans = Math.max(ans, freq);

            return ans;
        }
    }