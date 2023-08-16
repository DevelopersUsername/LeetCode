import java.util.ArrayList;

class Solution {

    private int ans;
    private boolean[] visited;
    private ArrayList<ArrayList<Integer>> graph, revGraph;

    public int minReorder(int n, int[][] connections) {

        graph = new ArrayList<>(n);
        revGraph = new ArrayList<>(n);
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
            revGraph.add(new ArrayList<>());
        }

        for (int[] connection : connections) {
            graph.get(connection[0]).add(connection[1]);
            revGraph.get(connection[1]).add(connection[0]);
        }

        visited[0] = true;
        dfs(0);

        return ans;
    }

    private void dfs(int start) {

        for (int connection : graph.get(start)) {
            if (!visited[connection]) {
                visited[connection] = true;
                ans++;
                dfs(connection);
            }
        }

        for (int connection : revGraph.get(start)) {
            if (!visited[connection]) {
                visited[connection] = true;
                dfs(connection);
            }
        }
    }
}