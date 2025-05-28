class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {

        int ans = 0;
        double maxDiagonal = 0;

        for (int[] dimension : dimensions) {
            double currentDiagonal = dimension[0] * dimension[0] + dimension[1] * dimension[1];
            if (maxDiagonal < currentDiagonal) {
                maxDiagonal = currentDiagonal;
                ans = dimension[0] * dimension[1];
            } else if (maxDiagonal == currentDiagonal)
                ans = Math.max(ans, dimension[0] * dimension[1]);
        }

        return ans;
    }
}