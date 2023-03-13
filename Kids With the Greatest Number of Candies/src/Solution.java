import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List result = new ArrayList(candies.length);

        int maxValue = 0;
        for (int v : candies) {
            maxValue = Math.max(maxValue, v);
        }

        for (int v : candies) {
            result.add(v + extraCandies >= maxValue);
        }

        return result;
    }
}