import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {

    private static final Set<Character> vowels = new HashSet<>(Arrays.asList('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'));

    public String toGoatLatin(String sentence) {

        StringBuilder builder = new StringBuilder();

        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {

            if (vowels.contains(words[i].charAt(0)))
                builder.append(words[i]).append("ma");
            else
                builder.append(words[i].substring(1)).append(words[i].charAt(0)).append("ma");

            builder.append("a".repeat(i + 1));
            if (i < words.length - 1) builder.append(" ");
        }

        return builder.toString();
    }
}