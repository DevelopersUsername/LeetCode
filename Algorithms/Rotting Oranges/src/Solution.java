import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int orangesRotting(int[][] grid) {

        int ans = 0, fresh = 0, m = grid.length, n = grid[0].length;
        int[] dirs = {0, 1, 0, -1, 0};
        Queue<int[]> rotten = new ArrayDeque<>();

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 2) rotten.add(new int[]{i, j});
                else if (grid[i][j] == 1) fresh++;

        while (!rotten.isEmpty() && fresh > 0) {

            ans++;
            for (int sz = rotten.size(); sz > 0; sz--) {

                int i = rotten.peek()[0], j = rotten.poll()[1];
                for (int k = 0; k < 4; k++) {

                    int x = i + dirs[k], y = j + dirs[k + 1];
                    if (x < 0 || x == m || y < 0 || y == n) continue;
                    if (grid[x][y] != 1) continue;

                    grid[x][y] = 2;
                    rotten.offer(new int[]{x, y});
                    fresh--;
                }
            }
        }

        return fresh == 0 ? ans : -1;
    }
}