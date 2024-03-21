class Solution {
    public String maximumOddBinaryNumber(String s) {

        int zeros = 0;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == '0') zeros++;
        for (int i = 0; i < s.length() - zeros - 1; i++) builder.append('1');
        for (int i = 0; i < zeros; i++) builder.append('0');

        return builder.append('1').toString();
    }
}