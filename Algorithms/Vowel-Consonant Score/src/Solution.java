import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {

    private final static Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public int vowelConsonantScore(String s) {

        int lowels = 0, consonants = 0;
        for (char c : s.toCharArray())
            if (c - 'a' < 0 || c - 'a' > 25) continue;
            else if (vowels.contains(c)) lowels++;
            else consonants++;

        return consonants == 0 ? 0 : lowels / consonants;
    }
}