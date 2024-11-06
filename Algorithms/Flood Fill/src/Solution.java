import java.util.LinkedList;
import java.util.Queue;

class Solution {

    private static final int[] dirsX = {0, 0, -1, 1};
    private static final int[] dirsY = {1, -1, 0, 0};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int pixel = image[sr][sc];
        int[][] visited = new int[image.length][image[0].length];
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{sr, sc});
        while (!queue.isEmpty()) {

            int[] cur = queue.poll();
            if (visited[cur[0]][cur[1]] == 1) continue;

            visited[cur[0]][cur[1]] = 1;
            image[cur[0]][cur[1]] = color;

            for (int i = 0; i < 4; i++) {

                int x = cur[0] + dirsX[i];
                int y = cur[1] + dirsY[i];

                if (x < 0 || x >= image.length || y < 0 || y >= image[0].length)
                    continue;

                if (image[x][y] == pixel)
                    queue.add(new int[]{x, y});
            }
        }

        return image;
    }
}