import java.util.HashSet;
import java.util.Set;

class Solution {

    private final static Set<Character> vowels = new HashSet<>(10);
    static {
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
    }

    public boolean halvesAreAlike(String s) {

        int ans = 0, i = 0, m = s.length() / 2;
        for (char c : s.toCharArray()) {
            if (i < m && vowels.contains(c)) ans++;
            else if (i >= m && vowels.contains(c)) ans--;
            i++;
        }

        return ans == 0;
    }
}