import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {

        char[] c1 = s1.toCharArray(), c2 = s2.toCharArray();

        List<Integer> diff = new ArrayList<>();

        for (int i = 0; i < c1.length; i++)
            if (c1[i] != c2[i])
                diff.add(i);

        return diff.isEmpty()
                || (diff.size() == 2
                && c1[diff.get(0)] == c2[diff.get(1)]
                && c1[diff.get(1)] == c2[diff.get(0)]);
    }
}