import java.util.HashMap;
import java.util.Map;

class Solution {

    static final String kVowels = "aeiou";
    public int findTheLongestSubstring(String s) {

        int ans = 0, prefix = 0;
        Map<Integer, Integer> prefixToIndex = new HashMap<>();
        prefixToIndex.put(0, -1);

        for (int i = 0; i < s.length(); ++i) {

            int index = kVowels.indexOf(s.charAt(i));
            if (index != -1)
                prefix ^= 1 << index;
            prefixToIndex.putIfAbsent(prefix, i);
            ans = Math.max(ans, i - prefixToIndex.get(prefix));
        }

        return ans;
    }
}