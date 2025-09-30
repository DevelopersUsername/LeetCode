import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int findLongestChain(int[][] pairs) {

        int ans = 0, prev = -1001;
        Arrays.sort(pairs, Comparator.comparingInt(pair -> pair[1]));

        for (int[] pair : pairs) {
            if (pair[0] > prev) {
                prev = pair[1];
                ans++;
            }
        }

        return ans;
    }
}