class Solution {
    public String sortString(String s) {

        StringBuilder sb = new StringBuilder();
        int[] t = new int[26];
        for (char c : s.toCharArray())
            t[c - 'a']++;
        build(sb, t, s.length());

        return sb.toString();
    }

    private void build(StringBuilder sb, int[] t, int length) {

        if (sb.length() == length) return;

        for (int i = 0; i < t.length; i++)
            if (t[i]-- > 0) sb.append((char) (i + 'a'));
        for (int i = t.length - 1; i >= 0; i--)
            if (t[i]-- > 0) sb.append((char) (i + 'a'));

        build(sb, t, length);
    }
}