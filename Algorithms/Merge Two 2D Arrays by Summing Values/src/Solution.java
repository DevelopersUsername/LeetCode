import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        List<int[]> ans = new ArrayList<>();
        int[] count = new int[1001];

        addCount(nums1, count);
        addCount(nums2, count);

        for (int i = 1; i < 1001; ++i)
            if (count[i] > 0)
                ans.add(new int[] {i, count[i]});

        return ans.toArray(int[][]::new);
    }

    private void addCount(int[][] nums, int[] count) {
        for (int[] num : nums)
            count[num[0]] += num[1];
    }
}