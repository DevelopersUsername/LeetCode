import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {

        int[][] ans = new int[rows * cols][], dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        boolean[][] visited = new boolean[rows][cols];
        visited[rCenter][cCenter] = true;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{rCenter, cCenter});

        int index = 0;
        while (!queue.isEmpty()) {

            int r = queue.peek()[0];
            int c = queue.poll()[1];

            ans[index++] = new int[] {r, c};

            for (int[] dir : dirs) {

                int currR = r + dir[0];
                int currC = c + dir[1];
                if (currR < 0 || currR >= rows || currC < 0 || currC >= cols)
                    continue;
                if (visited[currR][currC])
                    continue;

                visited[currR][currC] = true;
                queue.offer(new int[]{currR, currC});
            }
        }

        return ans;
    }
}