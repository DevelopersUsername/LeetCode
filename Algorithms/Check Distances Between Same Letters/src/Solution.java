import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkDistances(String s, int[] distance) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) map.put(c, i);
            else if (i - map.get(c) != ++distance[c - 'a']) return false;
        }

        return true;
    }
}