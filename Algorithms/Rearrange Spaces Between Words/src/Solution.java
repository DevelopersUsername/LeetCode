class Solution {
    public String reorderSpaces(String text) {

        StringBuilder ans = new StringBuilder(text.length());

        int words = 0, spaces = 0, part;
        char[] chars = text.toCharArray();
        char prev = ' ';

        for (char ch : chars) {
            if (ch == ' ') spaces++;
            else if (prev == ' ') words++;
            prev = ch;
        }

        if (spaces == 0) return text;
        else if (words == 1) part = spaces;
        else part = spaces / (words - 1);

        boolean flag = true;
        for (char ch : chars) {
            if (ch != ' ') {
                ans.append(ch);
                flag = false;
            } else if (!flag && --words > 0) {
                ans.append(" ".repeat(part));
                flag = true;
            }
        }
        int diff = chars.length - ans.length();
        if (diff > 0)
            ans.append(" ".repeat(diff));

        return ans.toString();
    }
}