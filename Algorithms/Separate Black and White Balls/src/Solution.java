class Solution {
    public long minimumSteps(String s) {

        long ans = 0L, ones = 0L;
        for (char c : s.toCharArray())
            if (c == '1') ones++;
            else ans += ones;

        return ans;
    }
}