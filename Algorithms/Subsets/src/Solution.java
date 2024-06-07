import java.util.ArrayList;
import java.util.List;

class Solution {

    private static List<List<Integer>> ans;

    public List<List<Integer>> subsets(int[] nums) {

        ans = new ArrayList<>();
        dfs(nums, 0, new ArrayList<>());
        return ans;
    }

    private void dfs(int[] nums, int curr, List<Integer> path) {

        ans.add(new ArrayList<>(path));
        for (int i = curr; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(nums, i + 1, path);
            path.remove(path.size() - 1);
        }
    }
}