import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        int[] t = new int[nums.length + 1];
        for (int num : nums) t[num]++;
        for (int i = 1; i < t.length; i++) if (t[i] == 0) ans.add(i);

        return ans;
    }
}