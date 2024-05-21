import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {

        int n = 0;
        for (int num : nums)
            if (num > n) n = num;

        int[] t = new int[n + 1];
        for (int num : nums) t[num]++;

        List<List<Integer>> ans = new ArrayList<>();

        n = 0;
        while (n < nums.length) {

            List<Integer> row = new ArrayList<>();
            for (int i = 0; i < t.length; i++)
                if (t[i]-- > 0) {
                    row.add(i);
                    n++;
                }

            if (!row.isEmpty()) ans.add(row);
        }

        return ans;
    }
}