import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        dfs(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }

    private static void dfs(int[] candidates, int target, int position, ArrayList<Integer> list, List<List<Integer>> ans) {

        if (target < 0) return;
        else if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = position; i < candidates.length; i++) {
            list.add(candidates[i]);
            dfs(candidates, target - candidates[i], i, list, ans);
            list.remove(list.size() - 1);
        }
    }
}