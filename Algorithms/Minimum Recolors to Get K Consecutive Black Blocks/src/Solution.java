class Solution {
    public int minimumRecolors(String blocks, int k) {

        int ans = 0, count = 0;

        char[] chars = blocks.toCharArray();
        for (int l = 0; l < chars.length; l++) {

            if (chars[l] == 'B') count++;
            if (l >= k && chars[l - k] == 'B') count--;
            ans = Math.max(ans, count);
        }

        return k - ans;
    }
}