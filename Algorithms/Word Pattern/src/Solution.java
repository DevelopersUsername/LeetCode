import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        int index = 0;
        Map<String, Character> map = new HashMap<>();
        for (String word : words) {

            char patternKey = pattern.charAt(index++);
            if ((map.containsKey(word) && map.get(word) != patternKey)
                    || (map.containsValue(patternKey) && !map.containsKey(word))) return false;
            else map.put(word, patternKey);
        }

        return true;
    }
}