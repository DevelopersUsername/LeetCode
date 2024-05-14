class Solution {
    public int minimizedStringLength(String s) {

        int ans = 0;
        int[] t = new int[26];

        for (char c : s.toCharArray())
            if (++t[c - 'a'] == 1) ans++;

        return ans;
    }
}