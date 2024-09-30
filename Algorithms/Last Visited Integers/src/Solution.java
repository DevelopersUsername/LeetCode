import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {

        List<Integer> ans = new ArrayList<>(), seen = new ArrayList<>();
        int k = 0;

        for (int num : nums)
            if (num >= 0) {
                seen.add(0, num);
                k = 0;
            } else if (seen.size() >= ++k) {
                ans.add(seen.get(k - 1));
            } else {
                ans.add(-1);
            }

        return ans;
    }
}