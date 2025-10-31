class Solution {
    public int kthFactor(int n, int k) {

        int i = 0, factor = 1;

        while (factor * factor < n)
            if (n % factor == 0 && ++i == k) return factor;
            else factor++;

        for (factor = n / factor; factor >= 1; factor--)
            if (n % factor == 0 && ++i == k) return n / factor;

        return -1;
    }
}