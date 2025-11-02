import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        int[] counts = new int[101];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int num : nums) {
            counts[num]++;
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        for (int i = min; i < max; i++) if (counts[i] == 0) ans.add(i);

        return ans;
    }
}