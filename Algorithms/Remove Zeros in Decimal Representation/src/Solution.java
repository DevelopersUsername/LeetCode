class Solution {
    public long removeZeros(long n) {

        long ans = 0, k = 1;

        while (n != 0) {
            int num = (int) (n % 10);
            if (num != 0) {
                ans += num * k;
                k *= 10;
            }
            n /= 10;
        }

        return ans;
    }
}