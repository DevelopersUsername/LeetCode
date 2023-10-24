import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[][] diagonalSort(int[][] mat) {

        int m = mat.length, n = mat[0].length;
        Map<Integer, Queue<Integer>> map = new HashMap<>();

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                map.computeIfAbsent(i - j, k -> new PriorityQueue<>()).add(mat[i][j]);

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = map.get(i - j).poll();

        return mat;
    }
}