class Solution {
    public int alternateDigitSum(int n) {

        int ans = 0, sign = 1;
        if ((int) (Math.log10(n) + 1) % 2 == 0) sign = -1;

        while (n > 0) {
            ans += n % 10 * sign;
            sign = -sign;
            n /= 10;
        }

        return ans;
    }
}