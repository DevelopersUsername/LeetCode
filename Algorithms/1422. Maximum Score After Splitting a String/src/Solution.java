class Solution {
    public int maxScore(String s) {

        int ans = 0;
        int zeros = 0, ones = 0;

        char[] chars = s.toCharArray();
        for (char c : chars)
            if (c == '1')
                ones++;

        for (int i = 0; i + 1 < s.length(); i++) {
            if (s.charAt(i) == '0')
                zeros++;
            else
                ones--;
            ans = Math.max(ans, zeros + ones);
        }

        return ans;
    }
}