class Solution {
    public String longestPalindrome(String s) {

        int start = 0, maxLen = 0, n = s.length();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            int l = i, r = i;
            while (r < n - 1 && chars[r] == chars[r + 1]) r++;
            while (l > 0 && r < n - 1 && chars[l - 1] == chars[r + 1]) {
                l--;
                r++;
            }
            if (r - l + 1 > maxLen) {
                maxLen = r - l + 1;
                start = l;
            }
        }

        return s.substring(start, start + maxLen);
    }
}