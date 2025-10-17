class Solution {
    public String getSmallestString(int n, int k) {

        char[] ans = new char[n];
        for (int i = n - 1; 0 <= i; i--) {
            int rank = Math.min(k - i, 26);
            ans[i] = (char) (rank - 1 + 'a');
            k -= rank;
        }

        return new String(ans);
    }
}