import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> ans = new ArrayList<>();

        String patternHash = getHash(pattern);
        for (String word : words)
            if (word.length() == pattern.length()
                    && patternHash.equals(getHash(word)))
                ans.add(word);

        return ans;
    }

    private static String getHash(String s) {

        int hash = 0;
        Map<Character, Integer> map = new HashMap<>();

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray())
            if (map.containsKey(c))
                sb.append(map.get(c));
            else {
                map.put(c, ++hash);
                sb.append(hash).append('.');
            }

        return sb.toString();
    }
}