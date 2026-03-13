class Solution {
    public int minSteps(String s, String t) {

        if (s.equals(t)) return 0;

        int ans = 0;
        int[] count = new int[26];

        for (char c : s.toCharArray()) count[c - 'a']++;
        for (char c : t.toCharArray()) count[c - 'a']--;
        for (int c : count) ans += Math.abs(c);

        return ans;
    }
}