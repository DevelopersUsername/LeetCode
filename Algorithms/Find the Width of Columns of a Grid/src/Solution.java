class Solution {
    public int[] findColumnWidth(int[][] grid) {

        int n = grid[0].length, elem = 0;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            for (int[] elems : grid)
                ans[elem] = Math.max(ans[elem], getWidth(elems[i]));
            elem++;
        }

        return ans;
    }

    private static int getWidth(int elem) {

        if (elem == 0) return 1;

        int width = 0;
        if (elem < 0) {
            width++;
            elem *= -1;
        }

        while (elem > 0) {
            elem /= 10;
            width++;
        }

        return width;
    }
}