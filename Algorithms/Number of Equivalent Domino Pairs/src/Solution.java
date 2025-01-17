import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {

        int ans = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int[] domino : dominoes) {

            int hash = getHash(domino);
            int count = map.getOrDefault(hash, 0);
            ans += count;
            map.put(hash, count + 1);
        }

        return ans;
    }

    private static int getHash(int[] domino) {
        return Math.min(domino[0], domino[1]) + Math.max(domino[0], domino[1]) * 10;
    }
}