import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean squareIsWhite(String coordinates) {

        Set<Character> even = new HashSet<>();
        even.add('a');
        even.add('c');
        even.add('e');
        even.add('g');

        if (even.contains(coordinates.charAt(0)))
            return (coordinates.charAt(1) - '0') % 2 == 0;
        else
            return (coordinates.charAt(1) - '0') % 2 == 1;
    }
}