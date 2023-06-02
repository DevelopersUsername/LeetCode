import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int elem : arr) {
            map.put(elem, map.getOrDefault(elem, 0) + 1);
        }

        int[] temp = new int[1001];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (temp[entry.getValue()] != 0)
                return false;
            else
                temp[entry.getValue()] = 1;
        }

        return true;
    }
}