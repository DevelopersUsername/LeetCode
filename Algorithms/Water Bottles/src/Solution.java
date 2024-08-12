class Solution {

    int ans = 0;
    public int numWaterBottles(int numBottles, int numExchange) {

        drink(numBottles, 0, numExchange);

        return ans;
    }

    private void drink(int fullBottles, int emptyBottles, int numExchange) {

        ans += fullBottles;
        if (fullBottles + emptyBottles < numExchange) return;

        emptyBottles += fullBottles;
        fullBottles = emptyBottles / numExchange;
        emptyBottles = emptyBottles % numExchange;

        drink(fullBottles, emptyBottles, numExchange);
    }
}