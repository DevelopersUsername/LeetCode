import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean isPathCrossing(String path) {

        int x = 0, y = 0;
        Map<Integer, Set<Integer>> map = new HashMap<>();

        Set<Integer> visited = new HashSet<>();
        visited.add(y);
        map.put(x, visited);

        for (int i = 0; i < path.length(); i++) {

            switch (path.charAt(i)) {
                case 'N': y++; break;
                case 'S': y--; break;
                case 'E': x++; break;
                case 'W': x--; break;
            }

            if (map.containsKey(x)) {

                Set<Integer> set = map.get(x);
                if (set.contains(y)) return true;
                else set.add(y);
            } else {
                visited = new HashSet<>();
                visited.add(y);
                map.put(x, visited);
            }
        }

        return false;
    }
}