import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {

    private static final Set<String> set = new HashSet<>(Arrays.asList("a", "e", "i", "o", "u"));
    public boolean doesAliceWin(String s) {

        for (String str : set)
            if (s.contains(str)) return true;

        return false;
    }
}