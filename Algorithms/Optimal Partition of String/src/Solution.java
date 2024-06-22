class Solution {
    public int partitionString(String s) {

        int ans = 1;
        int[] count = new int[26];
        for (char c : s.toCharArray())
            if (++count[c - 'a'] > 1) {
                count = new int[26];
                count[c - 'a']++;
                ans++;
            }

        return ans;
    }
}