import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int countPoints(String rings) {

        Map<Integer, Set<Character>> map = new HashMap<>();
        for (int i = 0; i < rings.length(); i += 2) {

            Set<Character> set = map.getOrDefault(rings.charAt(i + 1) - '0', new HashSet<>());
            set.add(rings.charAt(i));
            map.put(rings.charAt(i + 1) - '0', set);
        }

        int ans = 0;
        for (Map.Entry<Integer, Set<Character>> entry : map.entrySet()) {
            if (entry.getValue().size() == 3)
                ans++;
        }

        return ans;
    }
}