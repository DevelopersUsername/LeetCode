import java.util.Map;
import java.util.TreeMap;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        Map<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        String[] ans = new String[names.length];
        int i = ans.length;
        for (Map.Entry<Integer, String>  e : map.entrySet()) {
            ans[--i] = e.getValue();
        }

        return ans;
    }
}