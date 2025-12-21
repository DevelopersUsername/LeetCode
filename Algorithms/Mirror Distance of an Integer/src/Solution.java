class Solution {
    public int mirrorDistance(int n) {

        if (n < 10) return 0;
        else return Math.abs(n - mirror(n));
    }

    private static int mirror(int n) {

        int m = 0;
        while (n > 0) {
            m += n % 10;
            if (n >= 10) m *= 10;
            n /= 10;
        }

        return m;
    }
}