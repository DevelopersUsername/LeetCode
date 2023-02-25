import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();
        Character key;
        int value;

        for (int i = 0; i < magazine.length(); i++) {

            key = magazine.charAt(i);
            value = map.getOrDefault(key, 0);

            map.put(key, value + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {

            key = ransomNote.charAt(i);
            value = map.getOrDefault(key, 0);

            if (value == 0) {
                return false;
            }

            map.put(key, value - 1);
        }

        return true;
    }
}