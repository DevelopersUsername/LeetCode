import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> printVertically(String s) {

        List<String> ans = new ArrayList<>();

        int maxLen = 0;
        String[] words = s.split(" ");
        for (String word : words)
            maxLen = Math.max(maxLen, word.length());

        for (int i = 0; i < maxLen; i++) {

            StringBuilder sb = new StringBuilder();
            for (String word : words)
                sb.append(i < word.length() ? word.charAt(i) : ' ');
            while (sb.charAt(sb.length() - 1) == ' ')
                sb.deleteCharAt(sb.length() - 1);
            ans.add(sb.toString());
        }

        return ans;
    }
}