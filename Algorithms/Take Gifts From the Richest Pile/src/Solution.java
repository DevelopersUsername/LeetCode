import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public long pickGifts(int[] gifts, int k) {

        long ans = 0;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (final int gift : gifts)
            pq.offer(gift);

        for (int i = 0; i < k; i++)
            pq.offer((int) Math.sqrt(pq.poll()));

        while (!pq.isEmpty())
            ans += pq.poll();

        return ans;
    }
}