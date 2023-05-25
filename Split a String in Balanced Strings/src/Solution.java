class Solution {
    public int balancedStringSplit(String s) {

        int ans = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'R')
                count++;
            else
                count--;

            if (count == 0)
                ans++;
        }

        return ans;
    }
}