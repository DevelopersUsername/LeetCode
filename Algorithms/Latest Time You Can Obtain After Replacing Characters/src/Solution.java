class Solution {
    public String findLatestTime(String s) {

        StringBuilder ans = new StringBuilder(5);
        char[] chars = s.toCharArray();

        // Hours
        if (chars[0] == '?'
                && (chars[1] == '?'
                || chars[1] - '0' < 2))
            ans.append(1);
        else if (chars[0] == '?') ans.append(0);
        else ans.append(chars[0]);

        if (chars[1] == '?' && ans.charAt(0) == '0') ans.append(9);
        else if (chars[1] == '?') ans.append(1);
        else ans.append(chars[1]);

        ans.append(':');

        // Minutes
        if (chars[3] == '?') ans.append(5);
        else ans.append(chars[3]);
        if (chars[4] == '?') ans.append(9);
        else ans.append(chars[4]);

        return ans.toString();
    }
}