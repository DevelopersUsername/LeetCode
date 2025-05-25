class Solution {
    public long minCuttingCost(int n, int m, int k) {
        return cuttingCost(n, k) + cuttingCost(m, k);
    }

    private static long cuttingCost(int unit, int k) {

        long cost = 0;
        if (unit <= k) return cost;

        while (unit > k) {
            unit -= k;
            cost += (long) unit * k;
        }

        return cost;
    }
}