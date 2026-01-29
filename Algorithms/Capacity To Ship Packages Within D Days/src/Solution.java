class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int l = 0, r = 0;
        for (int weight : weights) {
            l = Math.max(l, weight);
            r += weight;
        }

        while (l < r) {
            int m = (l + r) / 2;
            if (check(weights, m) <= days) r = m;
            else l = m + 1;
        }

        return l;
    }

    private static int check(int[] weights, int shipCapacity) {

        int days = 1, sum = 0;
        for (int weight : weights)
            if (sum + weight > shipCapacity) {
                days++;
                sum = weight;
            } else sum += weight;

        return days;
    }
}