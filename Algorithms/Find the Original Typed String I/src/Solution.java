class Solution {
    public int possibleStringCount(String word) {

        int ans = 1;
        char[] chars = word.toCharArray();
        for (int i = 1; i < chars.length; i++)
            if (chars[i] == chars[i - 1])
                ans++;

        return ans;
    }
}