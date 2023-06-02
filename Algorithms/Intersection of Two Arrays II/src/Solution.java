import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> set = new HashMap<>();

        for (int i : nums1) {
            set.put(i, set.getOrDefault(i, 0) + 1);
        }

        for (int i : nums2) {
            if (set.containsKey(i) && set.get(i) >= 1) {
                list.add(i);
                set.put(i, set.get(i) - 1);
            }
        }

        int[] ans = new int[list.size()];
        int i = 0;
        for (int elem : list) {
            ans[i++] = elem;
        }

        return ans;
    }
}