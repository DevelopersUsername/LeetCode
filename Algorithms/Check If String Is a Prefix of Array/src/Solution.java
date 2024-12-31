class Solution {
    public boolean isPrefixString(String s, String[] words) {

        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            builder.append(word);
            if (builder.length() == s.length() & s.contentEquals(builder))
                return true;
        }

        return false;
    }
}