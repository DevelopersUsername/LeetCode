class Solution {
    public int maxDistance(int[] colors) {

        int n = colors.length, l = 0, r = n - 1;

        while (colors[l] == colors[n - 1])
            l++;
        while (colors[r] == colors[0])
            r--;

        return Math.max(n - 1 - l, r);
    }
}