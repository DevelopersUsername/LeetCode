import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> stringSequence(String target) {

        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder(target.length());

        for (char c : target.toCharArray()) {

            char prev = 'a' - 1;
            while (prev != c - 1) {

                prev++;
                sb.append(prev);
                ans.add(sb.toString());
                sb.deleteCharAt(sb.length() - 1);
            }

            sb.append(c);
            ans.add(sb.toString());
        }

        return ans;
    }
}