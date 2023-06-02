import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countBalls(int lowLimit, int highLimit) {

        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {

            int box = 0, num = i;
            while(num > 0) {
                box += num % 10;
                num /= 10;
            }

            map.put(box, map.getOrDefault(box, 0) + 1);
            ans = Math.max(ans, map.get(box));
        }

        return ans;
    }
}