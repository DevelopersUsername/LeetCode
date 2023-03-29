class Solution {
    public String reverseWords(String s) {

        StringBuilder builder = new StringBuilder(s.length());
        for (String str : s.split(" ")) {
            builder.append(new StringBuilder(str).reverse()).append(" ");
        }

        return builder.toString().trim();
    }
}