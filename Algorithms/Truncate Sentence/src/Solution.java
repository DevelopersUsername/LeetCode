class Solution {
    public String truncateSentence(String s, int k) {

        StringBuilder builder = new StringBuilder();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ')
                c++;

            if (c == k)
                break;
            else
                builder.append(s.charAt(i));
        }

        return builder.toString();
    }
}