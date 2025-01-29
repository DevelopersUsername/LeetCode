import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {

        List<String> ans = new ArrayList<>();

        int n = words.length, bit = -1;
        for (int i = 0; i < n; i++)
            if (bit != groups[i]) {
                ans.add(words[i]);
                bit = groups[i];
            }

        return ans;
    }
}