import java.util.*;

class Solution {
    public String frequencySort(String s) {

        int n = s.length();

        int[] count = new int[128];
        for (char c : s.toCharArray())
            count[c]++;

        List<Character>[] buckets = new List[n + 1];
        for (int i = 0; i < 128; i++) {
            int freq = count[i];
            if (freq > 0) {
                if (buckets[freq] == null)
                    buckets[freq] = new ArrayList<>();
                buckets[freq].add((char) i);
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int freq = n; freq > 0; freq--)
            if (buckets[freq] != null)
                for (char c : buckets[freq])
                    ans.append(String.valueOf(c).repeat(freq));

        return ans.toString();
    }
}