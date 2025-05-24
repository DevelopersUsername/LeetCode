class Solution {
    public int divide(int dividend, int divisor) {

        if (divisor == 0 || dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        long dvd = Math.abs((long) dividend),
                dvs = Math.abs((long) divisor),
                l = 1,
                r = dvd,
                m;

        if (dvd < dvs) return 0;

        while (l < r) {
            m = l + (r - l) / 2 + 1;
            if (m * dvs <= dvd) l = m;
            else r = m - 1;
        }

        return sign == 1 ? (int) l : (int) -l;
    }
}