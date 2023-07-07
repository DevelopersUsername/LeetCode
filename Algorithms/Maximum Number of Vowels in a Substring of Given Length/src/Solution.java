class Solution {
    final private String VOWELS = "aeiou";

    public int maxVowels(String s, int k) {

        int ans = 0, t = 0;
        for (int i = 0; i < s.length(); i++) {

            if (isInVowelsString(s.charAt(i))) t++;
            if (i >= k && isInVowelsString(s.charAt(i - k))) t--;

            ans = Math.max(ans, t);
        }

        return ans;
    }

    private boolean isInVowelsString(char c) {
        return VOWELS.indexOf(c) != -1;
    }
}