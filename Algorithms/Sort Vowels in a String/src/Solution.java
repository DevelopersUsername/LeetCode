import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {

    private static final Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public String sortVowels(String s) {

        char[] chars = s.toCharArray();
        int[] t = new int[58];

        for (char c : chars)
            if (set.contains(c))
                t[(c - 'A')]++;

        StringBuilder ans = new StringBuilder(chars.length);
        for (int i = 0, j = 0; i < chars.length; i++) {
            if (!set.contains(chars[i])) ans.append(chars[i]);
            else {
                for (int k = j; k < t.length; k++) {
                    if (t[k]-- > 0) {
                        ans.append((char) (k + 'A'));
                        break;
                    }
                }
            }
        }

        return ans.toString();
    }
}