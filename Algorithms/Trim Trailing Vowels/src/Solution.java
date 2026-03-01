import java.util.HashSet;
import java.util.Set;

class Solution {

    private static final Set<Character> vowels = new HashSet<>();
    static {
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
    }

    public String trimTrailingVowels(String s) {

        int len = s.length() - 1;
        while (len >= 0 && vowels.contains(s.charAt(len))) len--;

        return s.substring(0, len + 1);
    }
}