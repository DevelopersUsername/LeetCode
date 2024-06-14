import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {

        boolean[] visited = new boolean[n];
        List<Integer> ans = new ArrayList<>();

        edges.forEach(edge -> visited[edge.get(1)] = true);
        for (int i = 0; i < visited.length; i++)
            if (!visited[i]) ans.add(i);

        return ans;
    }
}