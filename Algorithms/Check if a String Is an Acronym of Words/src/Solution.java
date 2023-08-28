import java.util.List;

class Solution {
    public boolean isAcronym(List<String> words, String s) {

        if (words.size() != s.length()) return false;

        StringBuilder builder = new StringBuilder();
        for (String word : words)
            builder.append(word.charAt(0));

        return builder.toString().equals(s);
    }
}