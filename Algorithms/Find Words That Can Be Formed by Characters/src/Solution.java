class Solution {
    public int countCharacters(String[] words, String chars) {

        int ans = 0;
        int[] l = new int[26];
        for (char c : chars.toCharArray()) l[c - 'a']++;

        for (String word : words) {
            if (word.length() == chars.length()) continue;

            int[] t = new int[26];
            boolean isGood = true;

            for (int i = 0; i < word.length(); i++) {
                int c = word.charAt(i) - 'a';
                if (++t[c] > l[c]) {
                    isGood = false;
                    break;
                }
            }

            if (isGood) ans += word.length();
        }

        return ans;
    }
}