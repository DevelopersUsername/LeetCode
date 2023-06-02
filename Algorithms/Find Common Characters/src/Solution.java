import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> commonChars(String[] words) {

        List<String> ans = new ArrayList();
        if (words.length == 0)
            return ans;

        List<Map> list = new ArrayList();
        for (String word : words) {

            Map<Character, Integer>  map = new HashMap<>();
            list.add(map);
            for (Character c : word.toCharArray())
                map.put(c, map.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> firstMap = list.get(0);
        for (Map.Entry<Character, Integer> entry : firstMap.entrySet()) {

            boolean check = true;
            int count = entry.getValue();
            for (int i = 1; i < list.size(); i++) {

                Map<Character, Integer> currentMap = list.get(i);
                if (currentMap.containsKey(entry.getKey())) {
                    count = Math.min(count, currentMap.get(entry.getKey()));
                } else {
                    check = false;
                    break;
                }
            }

            if (check) {
                String currentValue = String.valueOf(entry.getKey());
                for (int i = 0; i < count; i++) {
                    ans.add(currentValue);
                }
            }
        }

        return ans;
    }
}