import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    private static int[] nums;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        nums = candidates;
        dfs(0, target, ans, new ArrayList<>());

        return ans;
    }

    private static void dfs(int pos, int target, List<List<Integer>> ans, List<Integer> path) {

        if (target < 0) return;
        else if (target == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = pos; i < nums.length; i++) {
            if (i > pos && nums[i] == nums[i - 1]) continue;
            if (nums[i] > target) break;
            path.add(nums[i]);
            dfs(i + 1, target - nums[i], ans, path);
            path.remove(path.size() - 1);
        }
    }
}