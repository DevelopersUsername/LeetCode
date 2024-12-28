class Solution {
    public int minimumMoves(String s) {

        int ans = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
            if (chars[i] == 'X') {
                i += 2;
                ans++;
            }

        return ans;
    }
}