class Solution {
    public int distributeCandies(int n, int limit) {
        
        final int first = ways(n - ++limit);
        final int second = ways(n - 2 * limit);
        final int third = ways(n - 3 * limit);

        return ways(n) - 3 * first + 3 * second - third;
    }

    private int ways(int n) {

        if (n < 0)
            return 0;

        int res = 1;
        for (int i = 1; i <= 2; i++)
            res = res * (n + 3 - i) / i;

        return res;
    }
}