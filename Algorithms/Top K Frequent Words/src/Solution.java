import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        record T(String word, int freq) {}
        List<String> ans = new ArrayList<>();
        Map<String, Integer> count = new HashMap<>();
        Queue<T> heap = new PriorityQueue<>(
                Comparator.comparingInt(T::freq).thenComparing(T::word, Comparator.reverseOrder()));

        for (String word : words)
            count.merge(word, 1, Integer::sum);

        for (String word : count.keySet()) {
            heap.offer(new T(word, count.get(word)));
            if (heap.size() > k)
                heap.poll();
        }

        while (!heap.isEmpty())
            ans.add(heap.poll().word);
        Collections.reverse(ans);

        return ans;
    }
}