import java.util.HashMap;
import java.util.Map;

class Solution {
    public int equalPairs(int[][] grid) {

        int ans = 0;
        HashMap<String, Integer> rHash = new HashMap<>();
        HashMap<String, Integer> cHash = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {

            StringBuilder rBuilder = new StringBuilder();
            StringBuilder cBuilder = new StringBuilder();
            for (int j = 0; j < grid[i].length; j++) {
                rBuilder.append(grid[i][j]).append('.');
                cBuilder.append(grid[j][i]).append('.');
            }

            String rVal = rBuilder.toString();
            String cVal = cBuilder.toString();

            rHash.put(rVal, rHash.getOrDefault(rVal, 0) + 1);
            cHash.put(cVal, cHash.getOrDefault(cVal, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : rHash.entrySet())
            ans += cHash.getOrDefault(entry.getKey(), 0) * entry.getValue();

        return ans;
    }
}