import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {

        List<Integer> ans = new ArrayList<>();

        int m = grid.length, n = grid[0].length;
        boolean reverse = false;
        for (int i = 0; i < m; i++) {

            if (reverse) left(grid, n, ans, i);
            else right(grid, n, ans, i);

            reverse = !reverse;
        }

        return ans;
    }

    private static void left(int[][] grid, int n, List<Integer> ans, int i) {
        for (int j = n - 1; j >= 0; j--)
            if (j % 2 == 1) ans.add(grid[i][j]);
    }

    private static void right(int[][] grid, int n, List<Integer> ans, int i) {
        for (int j = 0; j < n; j++)
            if (j % 2 == 0) ans.add(grid[i][j]);
    }
}