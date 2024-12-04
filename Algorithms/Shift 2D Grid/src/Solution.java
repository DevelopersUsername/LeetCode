import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int n = grid.length, m = grid[0].length;

        int[][] t = new int[n][m];
        k %= n * m;
        k = n * m - k;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                t[i][j] = grid[(i + (j + k) / m) % n][(j + k) % m];

        List<List<Integer>> ans = new ArrayList<>();
        for (int[] r : t)
            ans.add(Arrays.stream(r).boxed().collect(Collectors.toList()));

        return ans;
    }
}