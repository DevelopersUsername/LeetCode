import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<List<Integer>> ans = new ArrayList<>();
        dfs(graph, 0, new ArrayList<>(List.of(0)), ans);
        return ans;
    }

    private static void dfs(int[][] graph, int point, List<Integer> path, List<List<Integer>> ans) {
        if (point == graph.length - 1) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int p : graph[point]) {
            path.add(p);
            dfs(graph, p, path, ans);
            path.remove(path.size() - 1);
        }
    }
}