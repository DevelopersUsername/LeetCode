import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

class Solution {
    public String findCommonResponse(List<List<String>> responses) {

        String ans = "";
        int maxFreq = 0;
        Map<String, Integer> count = new HashMap<>();
        for (List<String> response : responses)
            for (String r : new HashSet<>(response)) count.merge(r, 1, Integer::sum);
        for (Integer value : count.values()) if (value > maxFreq) maxFreq = value;
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            String response = entry.getKey();
            int freq = entry.getValue();
            if (freq == maxFreq && (ans.isEmpty() || response.compareTo(ans) < 0)) ans = response;
        }

        return ans;
    }
}