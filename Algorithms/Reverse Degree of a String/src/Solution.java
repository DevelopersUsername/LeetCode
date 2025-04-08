class Solution {
    public int reverseDegree(String s) {

        int ans = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++)
            ans += (i + 1) * (26 - (chars[i] - 'a'));

        return ans;
    }
}