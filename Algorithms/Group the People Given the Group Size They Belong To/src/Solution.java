import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>[] nums = new List[500];

        for (int i = 0; i < groupSizes.length; i++) {

            if (nums[groupSizes[i]] == null)
                nums[groupSizes[i]] = new ArrayList<>();

            nums[groupSizes[i]].add(i);
            if (nums[groupSizes[i]].size() == groupSizes[i]) {
                ans.add(nums[groupSizes[i]]);
                nums[groupSizes[i]] = null;
            }
        }

        return ans;
    }
}