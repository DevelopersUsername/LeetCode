import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> partitionLabels(String s) {

        List<Integer> ans = new ArrayList<>();

        int[] map = new int[128];
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) map[chars[i]] = i;

        int l = 0, r;
        while (l < chars.length) {

            r = map[chars[l]];
            for (int i = l; i < r; i++)
                r = Math.max(r, map[chars[i]]);

            ans.add(r - l + 1);
            l = r + 1;
        }

        return ans;
    }
}