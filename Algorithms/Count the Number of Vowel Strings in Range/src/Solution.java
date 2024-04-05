import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {

    private static final Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public int vowelStrings(String[] words, int left, int right) {

        int ans = 0;

        for (int i = left; i <= right; i++)
            if (set.contains(words[i].charAt(0)) && set.contains(words[i].charAt(words[i].length() - 1))) ans++;

        return ans;
    }
}