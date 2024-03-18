import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();
        for (String s : paragraph.toLowerCase().replaceAll("[^aA-zZ]+", " ").split(" ")) {
            if (bannedSet.contains(s)) continue;
            map.compute(s, (w, prev) -> prev != null ? prev + 1 : 1);
        }

        int maxVal = 0;
        String ans = "";
        for (Map.Entry<String, Integer> entry : map.entrySet())
            if (entry.getValue() > maxVal) {
                maxVal = entry.getValue();
                ans = entry.getKey();
            }

        return ans;
    }
}