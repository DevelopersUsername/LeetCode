import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {

        int val = 0, n = nums.length;
        List<Boolean> ans = new ArrayList<>(n);

        for (int num : nums) {
            val = (val * 2 + num) % 5;
            ans.add(val % 5 == 0);
        }

        return ans;
    }
}