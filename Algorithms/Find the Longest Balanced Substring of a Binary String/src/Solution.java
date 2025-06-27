class Solution {
    public int findTheLongestBalancedSubstring(String s) {

        int ans = 0, n = s.length();

        for (int i = 0; i < n; ) {
            int zeros = 0;
            int ones = 0;

            while (i < n && s.charAt(i) == '0') {
                i++;
                zeros++;
            }
            while (i < n && s.charAt(i) == '1') {
                i++;
                ones++;
            }
            ans = Math.max(ans, Math.min(zeros, ones));
        }

        return ans * 2;
    }
}