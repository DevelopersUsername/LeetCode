import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[] ans = Arrays.copyOf(arr, arr.length);

        int rank = 1;
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.sort(arr);
        for (int i : arr)
            if (!map.containsKey(i)) map.put(i, rank++);

        for (int i = 0; i < ans.length; i++)
            ans[i] = map.get(ans[i]);

        return ans;
    }
}