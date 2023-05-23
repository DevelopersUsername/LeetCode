import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] ans = new int[k];
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        queue.addAll(map.keySet());

        for(int i = 0; i < k; i++){
            ans[i] = queue.poll();
        }

        return ans;
    }
}