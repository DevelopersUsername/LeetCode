import java.util.*;

class Solution {
    public int minSetSize(int[] arr) {

        int sum = 0, n = arr.length;
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : arr) count.merge(num, 1, Integer::sum);
        List<Map.Entry<Integer, Integer>> freq = new ArrayList<>(count.entrySet());
        freq.sort(Comparator.comparingInt(Map.Entry<Integer, Integer>::getValue).reversed());

        for (int i = 0; i < freq.size(); i++) {
            sum += freq.get(i).getValue();
            if (sum >= n / 2)
                return i + 1;
        }

        return -1;
    }
}