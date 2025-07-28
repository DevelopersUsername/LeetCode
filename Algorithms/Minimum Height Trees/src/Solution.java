import java.util.*;

class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {

        if (n == 0 || edges.length == 0) return List.of(0);

        List<Integer> ans = new ArrayList<>();
        Map<Integer, Set<Integer>> graph = new HashMap<>();

        for (int i = 0; i < n; i++)
            graph.put(i, new HashSet<>());

        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        for (Map.Entry<Integer, Set<Integer>> entry : graph.entrySet()) {
            int label = entry.getKey();
            Set<Integer> children = entry.getValue();
            if (children.size() == 1)
                ans.add(label);
        }

        while (n > 2) {
            n -= ans.size();
            List<Integer> nextLeaves = new ArrayList<>();
            for (int leaf : ans) {
                int u = graph.get(leaf).iterator().next();
                graph.get(u).remove(leaf);
                if (graph.get(u).size() == 1)
                    nextLeaves.add(u);
            }
            ans = nextLeaves;
        }

        return ans;
    }
}