import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {

    private final static Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public int maxFreqSum(String s) {

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a']++;

        int maxVowel = 0, maxConsonant = 0;
        for (int i = 0; i < 26; i++)
            if (vowels.contains((char) (i + 'a'))) maxVowel = Math.max(maxVowel, freq[i]);
            else maxConsonant = Math.max(maxConsonant, freq[i]);

        return maxConsonant + maxVowel;
    }
}