class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {

        int ans = 100, balance = purchaseAmount / 10;
        if (purchaseAmount % 10 > 4) balance++;

        return ans - balance * 10;
    }
}