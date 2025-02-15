import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {

        int part = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int d : deck)
            map.merge(d, 1, Integer::sum);

        for (final int value : map.values())
            part = gcd(part, value);

        return part > 1;
    }

    private int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }
}