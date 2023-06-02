class Solution {
    public String replaceDigits(String s) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            if (i % 2 == 1) {
                builder.append(shift(s.charAt(i - 1), s.charAt(i) - '0'));
            } else {
                builder.append(s.charAt(i));
            }
        }

        return builder.toString();
    }

    private static char shift(char c, int x) {
        return (char)(c + x);
    }
}