import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {

        int ans = 0, m = maze.length, n = maze[0].length;
        int[] dirs = {0, 1, 0, -1, 0};
        boolean[][] seen = new boolean[m][n];
        seen[entrance[0]][entrance[1]] = true;

        Queue<int[]> queue = new ArrayDeque<>(Arrays.asList(new int[]{entrance[0], entrance[1]}));
        while (!queue.isEmpty()) {

            ans++;
            for (int sz = queue.size(); sz > 0; sz--) {

                int i = queue.peek()[0], j = queue.poll()[1];
                for (int k = 0; k < 4; k++) {

                    int x = i + dirs[k], y = j + dirs[k + 1];

                    if (x < 0 || x == m || y < 0 || y == n) continue;
                    if (seen[x][y] || maze[x][y] == '+') continue;
                    if (x == 0 || x == m - 1 || y == 0 || y == n - 1) return ans;
                    queue.offer(new int[]{x, y});
                    seen[x][y] = true;
                }
            }
        }

        return -1;
    }
}