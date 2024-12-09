class Solution {
    public int maxPower(String s) {

        if (s.length() < 2) return 1;

        int ans = 0, count = 1;
        char[] chars = s.toCharArray();
        char prev = chars[0];

        for (int i = 1; i < chars.length; i++)
            if (chars[i] == prev) count++;
            else {
                ans = Math.max(ans, count);
                prev = chars[i];
                count = 1;
            }

        return Math.max(ans, count);
    }
}