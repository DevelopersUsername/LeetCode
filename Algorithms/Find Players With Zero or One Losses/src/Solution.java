import java.util.*;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {

        List<List<Integer>> ans = Arrays.asList(new ArrayList<>(), new ArrayList<>());
        Map<Integer, Integer> count = new TreeMap<>();

        for (int[] m : matches) {
            int win = m[0], low = m[1];
            if (!count.containsKey(win)) count.put(win, 0);
            count.merge(low, 1, Integer::sum);
        }

        for (int player : count.keySet()) {
            int los = count.get(player);
            if (los < 2) ans.get(los).add(player);
        }

        return ans;
    }
}