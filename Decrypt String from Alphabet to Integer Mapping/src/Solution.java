class Solution {
    public String freqAlphabets(String s) {

        StringBuilder builder = new StringBuilder();
        for (int i = s.length() - 1 ; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                builder.append((char) (Integer.parseInt(s.substring(i - 2, i)) + 96));
                i -= 2;
            } else {
                builder.append((char) (s.charAt(i) - '0' + 96));
            }
        }

        return builder.reverse().toString();
    }
}