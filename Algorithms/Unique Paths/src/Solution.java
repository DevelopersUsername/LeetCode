import java.util.Arrays;

class Solution {
    public int uniquePaths(int m, int n) {

        int[] t = new int[n];
        Arrays.fill(t, 1);

        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                t[j] += t[j - 1];

        return t[n - 1];
    }
}