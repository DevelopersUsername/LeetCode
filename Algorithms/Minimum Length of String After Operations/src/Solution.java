class Solution {
    public int minimumLength(String s) {

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++)
            count[s.charAt(i) - 'a']++;

        int ans = 0;
        for (int i : count)
            if (i > 0) ans += i % 2 == 1 ? 1 : 2;

        return ans;
    }
}