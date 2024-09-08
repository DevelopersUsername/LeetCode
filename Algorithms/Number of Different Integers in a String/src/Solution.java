import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numDifferentIntegers(String word) {

        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : word.toCharArray())
            if (c - '0' >= 0 && c - '0' <= 9) {
                sb.append(c);
            } else if (!sb.isEmpty()) {
                set.add(getNum(sb));
                sb = new StringBuilder();
            }

        if (!sb.isEmpty()) set.add(getNum(sb));

        return set.size();
    }

    private static String getNum(StringBuilder sb) {

        int start = 0;
        for (char c : sb.toString().toCharArray())
            if (c - '0' == 0) start++;
            else break;

        return sb.substring(start);
    }
}