import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {

        List<List<Integer>> ans = new ArrayList<>();

        if (s.length() < 2) return ans;

        int n = s.length();
        for (int start = 0, end = 0; start < n; start = end) {
            while (end < n && s.charAt(end) == s.charAt(start))
                end++;
            if (end - start >= 3)
                ans.add(List.of(start, end - 1));
        }

        return ans;
    }
}