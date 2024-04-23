class Solution {
    public int buyChoco(int[] prices, int money) {

        if (prices.length < 2) return money;

        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min1) {
                min2 = min1;
                min1 = price;
            }
            else if (price < min2) min2 = price;
        }

        if (min2 + min1 > money) return money;
        else return money - min1 - min2;
    }
}