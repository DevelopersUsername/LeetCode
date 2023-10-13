class Solution {
    public String makeSmallestPalindrome(String s) {

        if (s.length() == 1) return s;

        char[] ans = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            ans[i] = (char) Math.min(ans[i], ans[j]);
            ans[j] = ans[i];
        }

        return new String(ans);
    }
}