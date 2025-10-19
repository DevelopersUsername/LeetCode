import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {

        int i = 0;
        int[] ans = new int[adjacentPairs.length + 1];

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int[] adjacentPair : adjacentPairs) {
            map.putIfAbsent(adjacentPair[0], new ArrayList<>());
            map.get(adjacentPair[0]).add(adjacentPair[1]);
            map.putIfAbsent(adjacentPair[1], new ArrayList<>());
            map.get(adjacentPair[1]).add(adjacentPair[0]);
        }

        for (Map.Entry<Integer, List<Integer>> integerListEntry : map.entrySet())
            if (integerListEntry.getValue().size() == 1) {
                ans[i++] = integerListEntry.getKey();
                ans[i++] = integerListEntry.getValue().get(0);
                break;
            }

        while (i < adjacentPairs.length + 1) {
            int tail = ans[i - 1];
            int prev = ans[i - 2];
            List<Integer> val = map.get(tail);
            if (val.get(0) == prev) ans[i++] = val.get(1);
            else ans[i++] = val.get(0);
        }

        return ans;
    }
}