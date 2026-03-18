import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> pathInZigZagTree(int label) {

        List<Integer> ans = new ArrayList<>();

        int x = 1, i = 1;
        while ((x << 1) <= label) {
            x <<= 1;
            i++;
        }

        while (i > 0) {
            ans.add(label);
            label = ((1 << (i - 1)) + (1 << i--) - 1 - label) >> 1;
        }

        Collections.reverse(ans);

        return ans;
    }
}