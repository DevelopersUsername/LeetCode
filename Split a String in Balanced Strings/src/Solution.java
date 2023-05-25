class Solution {
    public int balancedStringSplit(String s) {

        int ans = 0, lCount = 0, rCount = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'R')
                rCount++;
            else if (s.charAt(i) == 'L')
                lCount++;

            if (rCount == lCount) {
                rCount = 0;
                lCount = 0;
                ans++;
            }
        }

        return ans;
    }
}