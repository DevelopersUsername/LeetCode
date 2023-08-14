import java.util.*;

class SmallestInfiniteSet {

    private final Queue<Integer> queue;
    private final Set<Integer> set;
    private int min;

    public SmallestInfiniteSet() {
        min = 1;
        queue = new PriorityQueue<>();
        set = new HashSet<>();
    }

    public int popSmallest() {

        if (!queue.isEmpty()) {

            set.remove(queue.peek());

            return queue.poll();
        }

        return min++;
    }

    public void addBack(int num) {
        if (min > num && !set.contains(num)) {
            set.add(num);
            queue.offer(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */