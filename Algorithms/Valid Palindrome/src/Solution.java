class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder builder = new StringBuilder();
        for (char ch : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(ch))
                builder.append(ch);
        }

        return builder.toString().equals(builder.reverse().toString());
    }
}