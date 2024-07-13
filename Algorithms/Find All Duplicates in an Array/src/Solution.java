import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        int[] t = new int[nums.length + 1];

        for (int num : nums) t[num]++;
        for (int i = 0; i < t.length; i++)
            if (t[i] > 1) ans.add(i);

        return ans;
    }
}