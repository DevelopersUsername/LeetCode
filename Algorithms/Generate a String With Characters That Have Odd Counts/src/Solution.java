class Solution {
    public String generateTheString(int n) {

        StringBuilder builder = new StringBuilder(n);

        builder.append("a".repeat(n - 1));
        if (n % 2 == 1) builder.append('a');
        else builder.append('b');

        return builder.toString();
    }
}