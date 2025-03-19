import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> ans = new ArrayList<>();
        for (int i = num.length - 1; i >= 0; i--) {
            ans.add((num[i] + k) % 10);
            if (k > 0) k = (num[i] + k) / 10;
        }

        while (k > 0) {
            ans.add(k % 10);
            k /= 10;
        }

        Collections.reverse(ans);

        return ans;
    }
}