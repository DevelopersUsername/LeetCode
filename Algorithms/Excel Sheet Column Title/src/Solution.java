class Solution {
    public String convertToTitle(int columnNumber) {

        StringBuilder builder = new StringBuilder();
        while (columnNumber > 0) {
            builder.append((char) ('A' + ((columnNumber-- - 1) % 26)));
            columnNumber /= 26;
        }

        return builder.reverse().toString();
    }
}