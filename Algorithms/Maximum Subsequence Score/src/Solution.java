import java.util.AbstractMap;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {

        long ans = 0, sum = 0;

        AbstractMap.SimpleEntry<Integer, Integer>[] vocabulary = new AbstractMap.SimpleEntry[nums1.length];
        Queue<Integer> queue = new PriorityQueue<>(k + 1);

        for (int i = 0; i < nums1.length; i++)
            vocabulary[i] = new AbstractMap.SimpleEntry<>(nums2[i], nums1[i]);

        Arrays.sort(vocabulary, (a, b) -> Integer.compare(b.getKey(), a.getKey()));
        for (AbstractMap.SimpleEntry<Integer, Integer> pair : vocabulary) {

            queue.offer(pair.getValue());
            sum += pair.getValue();

            if (queue.size() > k) sum -= queue.poll();
            if (queue.size() == k) ans = Math.max(ans, sum * pair.getKey());
        }

        return ans;
    }
}