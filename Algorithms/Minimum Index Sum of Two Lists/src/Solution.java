import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        List<String> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++)
            map.put(list1[i], i);

        for (int i = 0; i < list2.length; i++) {

            String v = list2[i];
            if (map.containsKey(v)) {

                int indexSum = map.get(v) + i;
                if (min == indexSum) {
                    ans.add(v);
                } else if (min > indexSum) {
                    min = indexSum;
                    ans.clear();
                    ans.add(v);
                }
            }
        }

        return ans.toArray(new String[0]);
    }
}