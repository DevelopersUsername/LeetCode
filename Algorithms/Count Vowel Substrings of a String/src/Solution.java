import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    private static final Set<Character> vowels = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u'));

    public int countVowelSubstrings(String word) {

        int ans = 0;
        char[] chars = word.toCharArray();
        Set<Character> count = new HashSet<>();

        for (int l = 0; l < chars.length; l++) {

            if (!isVowel(chars[l])) continue;

            count.clear();
            for (int r = l; r < chars.length; r++) {

                if (!isVowel(chars[r])) break;

                count.add(chars[r]);
                if (count.size() == 5)
                    ans++;
            }
        }

        return ans;
    }

    private static boolean isVowel(char c) {
        return vowels.contains(c);
    }
}