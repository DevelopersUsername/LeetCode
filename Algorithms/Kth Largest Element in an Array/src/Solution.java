import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int findKthLargest(int[] nums, int k) {

        Queue<Integer> queue = new PriorityQueue<>(k);
        for (int num : nums) {

            queue.offer(num);
            while (queue.size() > k)
                queue.poll();
        }

        return queue.peek();
    }
}
