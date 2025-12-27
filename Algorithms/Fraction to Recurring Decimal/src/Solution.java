import java.util.HashMap;
import java.util.Map;

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {

        if (numerator == 0
                || denominator == 0) return "0";

        StringBuilder ans = new StringBuilder();
        ans.append((numerator > 0) ^ (denominator > 0) ? "-" : "");

        long a = Math.abs((long) numerator), b = Math.abs((long) denominator);
        ans.append(a / b);

        a %= b;
        if (a == 0) return ans.toString();

        ans.append(".");
        Map<Long, Integer> map = new HashMap<>();
        while (a != 0) {
            map.put(a, ans.length());
            a *= 10;
            ans.append(a / b);
            a %= b;
            if (map.containsKey(a)) {
                ans
                        .insert(map.get(a), "(")
                        .append(")");
                break;
            }
        }

        return ans.toString();
    }
}