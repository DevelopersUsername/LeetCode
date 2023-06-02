import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean digitCount(String num) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < num.length(); i++) {

            char x = num.charAt(i);
            map.put(x - '0', map.getOrDefault(x - '0', 0) + 1);
        }

        for(int i = 0; i<num.length(); i++) {

            if (!map.containsKey(i)) {
                if(num.charAt(i) != '0')
                    return false;
                else
                    continue;
            }

            if(num.charAt(i) - '0' != map.get(i))
                return false;
        }

        return true;
    }
}