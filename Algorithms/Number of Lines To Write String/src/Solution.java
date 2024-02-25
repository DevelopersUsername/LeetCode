class Solution {
    public int[] numberOfLines(int[] widths, String s) {

        int lines = 0, pixels = 0;

        for (char c : s.toCharArray()) {

            pixels += widths[c - 'a'];
            if (pixels > 100) {
                lines++;
                pixels = widths[c - 'a'];
            }
        }

        return new int[]{lines + (pixels > 0 ? 1 : 0), pixels};
    }
}