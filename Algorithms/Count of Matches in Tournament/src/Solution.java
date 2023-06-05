class Solution {
    public int numberOfMatches(int n) {

        int ans = 0;
        while (n > 1) {

            int t = n % 2;
            n /= 2;
            ans += n;
            n += t;
        }

        return ans;
    }
}