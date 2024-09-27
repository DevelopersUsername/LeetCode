class Solution {
    public String reformatNumber(String number) {

        StringBuilder sb = new StringBuilder(), ans = new StringBuilder();
        for (char c : number.toCharArray())
            if (Character.isDigit(c)) sb.append(c);

        int l = sb.length();
        for (int i = 0; i < l; i++) {

            if (l - i > 4 || l - i == 3) {
                ans.append(sb, i, i + 3);
                i += 2;
            } else ans.append(sb, i, i++ + 2);

            if (i + 1 < l) ans.append("-");
        }

        return ans.toString();
    }
}