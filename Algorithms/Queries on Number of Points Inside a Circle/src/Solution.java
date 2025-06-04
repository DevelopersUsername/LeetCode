class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {

            int x = queries[i][0];
            int y = queries[i][1];
            int r = queries[i][2] * queries[i][2];

            for (int[] point : points)
                if ((point[0] - x) * (point[0] - x) + (point[1] - y) * (point[1] - y) <= r)
                    ans[i]++;
        }
        return ans;
    }
}