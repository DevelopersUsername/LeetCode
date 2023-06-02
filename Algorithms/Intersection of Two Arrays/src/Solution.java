import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }

        for (int i : nums2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }

        int[] ans = new int[set2.size()];
        int i = 0;
        for (int num : set2) {
            ans[i++] = num;
        }

        return ans;
    }
}