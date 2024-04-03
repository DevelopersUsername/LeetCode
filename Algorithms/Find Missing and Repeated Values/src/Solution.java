class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int[] ans = new int[2], t = new int[(int) Math.pow(grid.length, 2) + 1];
        for (int[] ints : grid)
            for (int anInt : ints)
                t[anInt]++;

        for (int i = 1; i < t.length; i++) {
            if (t[i] == 2) ans[0] = i;
            else if (t[i] == 0) ans[1] = i;
            if (ans[0] != 0 && ans[1] != 0) break;
        }

        return ans;
    }
}