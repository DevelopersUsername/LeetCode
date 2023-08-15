class Solution {
    public int findCircleNum(int[][] isConnected) {

        int ans = 0;
        boolean[] visited = new boolean[isConnected.length];
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, i);
                ans++;
            }
        }

        return ans;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int i) {

        for (int j = 0; j < isConnected.length; j++) {
            if (!visited[j] && isConnected[i][j] == 1) {
                visited[j] = true;
                dfs(isConnected, visited, j);
            }
        }
    }
}