import java.util.HashSet;
import java.util.Set;

class Solution {
    public int residuePrefixes(String s) {

        Set<Character> set = new HashSet<>();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
            if (set.size() == (i + 1) % 3)
                ans++;
            else if (set.size() > 2)
                return ans;
        }

        return ans;
    }
}