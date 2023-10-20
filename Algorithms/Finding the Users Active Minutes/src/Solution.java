import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {

        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] log : logs) {
            map.putIfAbsent(log[0], new HashSet<>());
            map.get(log[0]).add(log[1]);
        }

        int[] ans = new int[k];
        for (final int id : map.keySet()) ++ans[map.get(id).size() - 1];

        return ans;
    }
}