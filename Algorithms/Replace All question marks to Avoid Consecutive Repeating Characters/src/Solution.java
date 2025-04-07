class Solution {

    private final static char[] alphabet = new char[]{
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
            'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
            'z'};

    public String modifyString(String s) {

        int n = s.length();
        StringBuilder ans = new StringBuilder(n);
        char[] chars = s.toCharArray();

        char prev = '?';
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?')
                prev = getChar(prev, i < n - 1 ? chars[i + 1] : '?');
            else prev = chars[i];
            ans.append(prev);
        }

        return ans.toString();
    }

    private static char getChar(char prev, char next) {

        for (char c : alphabet)
            if (c != prev && c != next) return c;

        return '?';
    }
}