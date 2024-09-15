class Solution {
    public boolean validPalindrome(String s) {

        for (int l = 0, r = s.length() - 1; l < r; l++, r--)
            if (s.charAt(l) != s.charAt(r))
                return check(s, l + 1, r) || check(s, l, r - 1);

        return true;
    }

    private static boolean check(String s, int l, int r) {

        while (l < r)
            if (s.charAt(l++) != s.charAt(r--)) return false;

        return true;
    }
}