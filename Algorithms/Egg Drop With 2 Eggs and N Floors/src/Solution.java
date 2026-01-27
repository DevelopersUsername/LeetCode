class Solution {
    public int twoEggDrop(int n) {
        return dropEgg(2, n);
    }

    public int dropEgg(int k, int n) {

        int[] dp = new int[k + 1];
        int drop = 0;

        while (dp[k] < n) {
            drop++;
            for (int i = k; i >= 1; i--)
                dp[i] = dp[i] + dp[i - 1] + 1;
        }

        return drop;
    }
}