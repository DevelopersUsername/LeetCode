class Solution {
    public int binaryGap(int n) {

        char[] bits = Integer.toBinaryString(n).toCharArray();
        int l = 0, ans = 0;
        for (int r = 0; r < bits.length; r++)
            if (bits[r] == '1') {
                ans = Math.max(ans, r - l);
                l = r;
            }

        return ans;
    }
}