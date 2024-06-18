class Solution {
    public String clearDigits(String s) {

        StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) - 'a' < 0 || builder.charAt(i) - 'a' > 25) {
                builder.deleteCharAt(i--);
                builder.deleteCharAt(i--);
            }
        }

        return builder.toString();
    }
}