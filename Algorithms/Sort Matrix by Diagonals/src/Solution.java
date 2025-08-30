import java.util.*;

class Solution {
    public int[][] sortMatrix(int[][] grid) {

        int n = grid.length;
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                int key = i - j;
                map.putIfAbsent(key, new  ArrayList<>());
                map.get(key).add(grid[i][j]);
            }

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> values = entry.getValue();
            if (entry.getKey() < 0) values.sort(Collections.reverseOrder());
            else Collections.sort(values);
        }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                int key = i - j;
                grid[i][j] = map.get(key).remove(map.get(key).size() - 1);
            }

        return grid;
    }
}