class Solution {
    public int maxCount(int m, int n, int[][] ops) {

        int x = n, y = m;

        for (int[] op : ops) {
            x = Math.min(x, op[1]);
            y = Math.min(y, op[0]);
        }

        return x * y;
    }
}