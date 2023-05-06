import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        Map<String, Integer> map = new HashMap<>();
        map.put("type", 0);
        map.put("color", 1);
        map.put("name", 2);

        int ans = 0;
        for (List<String> l : items) {
            if (l.get(map.get(ruleKey)).equals(ruleValue))
                ans++;
        }

        return ans;
    }
}