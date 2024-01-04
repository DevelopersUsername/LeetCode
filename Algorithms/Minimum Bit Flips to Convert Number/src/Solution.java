class Solution {
    public int minBitFlips(int start, int goal) {

        if (start == goal) return 0;

        int ans = 0, t = start ^ goal;
        while (t != 0) {
            ans += t & 1;
            t >>= 1;
        }

        return ans;
    }
}