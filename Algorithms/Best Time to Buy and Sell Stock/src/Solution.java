class Solution {
    public int maxProfit(int[] prices) {

        int ans = 0, profit = Integer.MIN_VALUE;
        for (int price : prices) {
            ans = Math.max(ans, profit + price);
            profit = Math.max(profit, -price);
        }

        return ans;
    }
}