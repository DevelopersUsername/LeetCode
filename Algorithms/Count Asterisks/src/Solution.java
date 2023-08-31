class Solution {
    public int countAsterisks(String s) {

        int ans = 0;
        boolean pair = false;

        for (char c : s.toCharArray()) {
            if (c == '|') pair = !pair;
            if (!pair && c == '*') ans++;
        }

        return ans;
    }
}