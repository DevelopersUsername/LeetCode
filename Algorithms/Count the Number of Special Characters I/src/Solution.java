class Solution {
    public int numberOfSpecialChars(String word) {

        int ans = 0;
        int[] lowerCount = new int[26], upperCount = new int[26];

        for (char c : word.toCharArray())
            if (Character.isLowerCase(c)) lowerCount[c - 'a']++;
            else upperCount[c - 'A']++;

        for (int i = 0; i < 26; i++)
            if (lowerCount[i] > 0 && upperCount[i] > 0) ans++;

        return ans;
    }
}