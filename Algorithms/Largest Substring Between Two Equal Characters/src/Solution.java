class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {

        int ans = -1;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++)
            for (int j = chars.length - 1; j > i; j--)
                if (chars[i] == chars[j]) {
                    ans = Math.max(ans, j - i - 1);
                    break;
                }

        return ans;
    }
}