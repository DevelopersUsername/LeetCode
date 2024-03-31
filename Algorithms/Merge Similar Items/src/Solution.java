import java.util.*;

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {

        List<List<Integer>> ans = new ArrayList<>(Math.max(items1.length, items2.length));
        int[] count = new int[1001];

        for (int[] item : items1)
            count[item[0]] += item[1];

        for (int[] item : items2)
            count[item[0]] += item[1];

        for (int i = 1; i < count.length; ++i)
            if (count[i] > 0) ans.add(Arrays.asList(i, count[i]));

        return ans;
    }
}