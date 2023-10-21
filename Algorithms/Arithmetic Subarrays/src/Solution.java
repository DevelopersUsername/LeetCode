import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {

            int[] t = new int[r[i] - l[i] + 1];
            for (int j = l[i], k = 0; j <= r[i]; j++, k++) t[k] = nums[j];
            Arrays.sort(t);

            int range = t[0] - t[1];
            boolean flag = true;
            for (int m = 2; m < t.length; m++)
                if (t[m-1] - t[m] != range) {
                    flag = false;
                    break;
                }

            ans.add(flag);
        }

        return ans;
    }
}