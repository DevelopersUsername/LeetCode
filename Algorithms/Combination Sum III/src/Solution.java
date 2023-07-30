import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();
        combine(ans, new ArrayList<>(), k, n, 1);

        return ans;
    }

    private void combine(List<List<Integer>> ans, List<Integer> list, int k, int n, int c) {

        if (k == 0 && n == 0) {
            ans.add(new ArrayList<>(list));
            return;
        } else if (k == 0 || n < 0) return;

        for (int i = c; i <= 9; i++) {
            list.add(i);
            combine(ans, list, k - 1, n - i, i + 1);
            list.remove(list.size() - 1);
        }
    }
}