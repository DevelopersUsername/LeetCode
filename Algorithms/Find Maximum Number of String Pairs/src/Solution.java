import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {

        int ans = 0;
        Set<String> set = new HashSet<>();
        for (String word : words)
            if (set.contains(new StringBuilder(word).reverse().toString())) ans++;
            else set.add(word);

        return ans;
    }
}