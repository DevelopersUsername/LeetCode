class Solution {
    public int oddCells(int m, int n, int[][] indices) {

        boolean[] rows = new boolean[m], cols = new boolean[n];
        for (int[] index : indices) {
            rows[index[0]] = !rows[index[0]];
            cols[index[1]] = !cols[index[1]];
        }

        int ans = 0;
        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                if (rows[i] ^ cols[j])
                    ans++;

        return ans;
    }
}