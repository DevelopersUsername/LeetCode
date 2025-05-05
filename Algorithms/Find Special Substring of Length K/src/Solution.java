class Solution {
    public boolean hasSpecialSubstring(String s, int k) {

        char[] chars = s.toCharArray();
        int count = 1, n = chars.length;

        for (int i = 1; i < n; i++)
            if (chars[i] == chars[i - 1]) count++;
            else if (count == k) return true;
            else count = 1;

        return k == count;
    }
}