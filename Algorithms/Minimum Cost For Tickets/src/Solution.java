class Solution {
    public int mincostTickets(int[] days, int[] costs) {

        int max = days[days.length - 1];
        boolean[] visited = new boolean[max + 1];

        for (int day : days) visited[day] = true;

        int[] dp = new int[max + 1];
        dp[0] = 0;

        for (int i = 1; i <= max; i++) {
            if (!visited[i]) {
                dp[i] = dp[i - 1];
                continue;
            }

            dp[i] = costs[0] + dp[i - 1];
            dp[i] = Math.min(dp[Math.max(0, i - 7)] + costs[1], dp[i]);
            dp[i] = Math.min(dp[Math.max(0, i - 30)] + costs[2], dp[i]);
        }

        return dp[max];
    }
}