import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numSplits(String s) {

        int ans = 0, n = s.length();
        int[] left = new int[n], right = new int[n];
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(s.charAt(i));
            left[i] = set.size();
        }

        set.clear();
        for (int i = n - 1; i >= 0; i--) {
            set.add(s.charAt(i));
            right[i] = set.size();
        }

        for (int i = 0; i < n - 1; i++)
            if (left[i] == right[i + 1])
                ans++;

        return ans;
    }
}