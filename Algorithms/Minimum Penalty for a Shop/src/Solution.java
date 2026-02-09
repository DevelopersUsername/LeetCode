class Solution {
    public int bestClosingTime(String customers) {

        int ans = 0, profit = 0, maxProfit = 0;
        for (int i = 0; i < customers.length(); i++) {
            profit += customers.charAt(i) == 'Y' ? 1 : -1;
            if (profit > maxProfit) {
                maxProfit = profit;
                ans = i + 1;
            }
        }

        return ans;
    }
}