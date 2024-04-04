import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        int[][] t = new int[mat.length][2];
        for (int i = 0; i < mat.length; ++i) {
            t[i][0] = IntStream.of(mat[i]).sum();
            t[i][1] = i;
        }

        Arrays.sort(t, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) ans[i] = t[i][1];

        return ans;
    }
}