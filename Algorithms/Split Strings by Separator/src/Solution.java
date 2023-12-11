import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {

        List<String> ans = new ArrayList<>();

        for (String word : words) {

            StringBuilder builder = new StringBuilder();
            for (char c : word.toCharArray()) {
                if (c == separator && !builder.isEmpty()) {
                    ans.add(builder.toString());
                    builder.setLength(0);
                } else if (c != separator) builder.append(c);
            }

            if (!builder.isEmpty()) ans.add(builder.toString());
        }

        return ans;
    }
}