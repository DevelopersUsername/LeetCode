class Solution {
    public String getEncryptedString(String s, int k) {

        StringBuilder builder = new StringBuilder(s.length());

        k %= s.length();
        for (int i = k; i < s.length(); i++)
            builder.append(s.charAt(i));
        for (int i = 0; i < k; i++)
            builder.append(s.charAt(i));

        return builder.toString();
    }
}