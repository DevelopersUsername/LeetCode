import java.util.*;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                (a, b) -> Integer.compare(nums1[a[0]] + nums2[a[1]], nums1[b[0]] + nums2[b[1]])
        );

        for (int i = 0; i < Math.min(nums1.length, k); i++)
            minHeap.offer(new int[]{i, 0});

        while (k-- > 0 && !minHeap.isEmpty()) {

            int[] indices = minHeap.poll();
            int i = indices[0], j = indices[1];

            ans.add(List.of(nums1[i], nums2[j]));
            if (j + 1 < nums2.length)
                minHeap.offer(new int[]{i, j + 1});
        }

        return ans;
    }
}