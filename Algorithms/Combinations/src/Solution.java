import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> ans = new ArrayList<>();
        dfs(ans, new ArrayList<>(), 1, n, k);

        return ans;
    }

    private void dfs(List<List<Integer>> ans, List<Integer> list, int l, int n, int k) {

        if (list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int r = l; r <= n; r++) {
            list.add(r);
            dfs(ans, list, r + 1, n, k);
            list.remove(list.size() - 1);
        }
    }
}