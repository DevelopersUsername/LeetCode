class Solution {
    public int maxProfit(int[] prices) {

        int ans = 0, hold = Integer.MIN_VALUE;

        for (final int price : prices) {
            ans = Math.max(ans, hold + price);
            hold = Math.max(hold, ans - price);
        }

        return ans;
    }
}