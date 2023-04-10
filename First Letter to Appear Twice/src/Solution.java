import java.util.HashSet;
import java.util.Set;

class Solution {
    public char repeatedCharacter(String s) {

        Set<Character> set = new HashSet<>();
        for (Character c : s.toCharArray()) {
            if (set.contains(c))
                return c;
            else
                set.add(c);
        }

        return ' ';
    }
}