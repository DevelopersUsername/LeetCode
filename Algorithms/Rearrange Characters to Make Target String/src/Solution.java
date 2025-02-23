class Solution {
    public int rearrangeCharacters(String s, String target) {

        int ans = 101;

        int[] counts = new int[26], targetCount = new int[26];
        for (char c : s.toCharArray()) counts[c - 'a']++;
        for (char c : target.toCharArray()) targetCount[c - 'a']++;

        for (char c : target.toCharArray())
            if (counts[c - 'a'] >= 0)
                ans = Math.min(ans, counts[c - 'a'] / targetCount[c - 'a']);

        return ans;
    }
}