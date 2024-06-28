import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int lastStoneWeight(int[] stones) {

        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones)
            q.offer(stone);

        while (q.size() > 1) {
            int a = q.poll();
            int b = q.poll();
            if (a != b)
                q.offer(a - b);
        }

        return q.isEmpty() ? 0 : q.peek();
    }
}