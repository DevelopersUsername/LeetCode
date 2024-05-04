import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> intersection(int[][] nums) {

        List<Integer> ans = new ArrayList<>();
        int[] t = new int[1001];

        for (int[] num : nums)
            for (int i : num) t[i]++;

        for (int i = 0; i < t.length; i++)
            if (t[i] == nums.length) ans.add(i);

        return ans;
    }
}