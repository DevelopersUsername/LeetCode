class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {

        int ans = -1, min = Integer.MAX_VALUE;

        for (int i = 0; i < points.length; i++)

            if (points[i][0] == x || points[i][1] == y) {

                int distance = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (distance < min) {
                    min = distance;
                    ans = i;
                }
            }

        return ans;
    }
}