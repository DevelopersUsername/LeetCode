import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {


        Set<Integer> set1 = arrToSet(nums1);
        Set<Integer> set2 = arrToSet(nums2);

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(findDifferenceSet(set1, set2));
        ans.add(findDifferenceSet(set2, set1));

        return ans;
    }

    private Set<Integer> arrToSet(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (Integer num : nums) {
            set.add(num);
        }

        return set;
    }

    private List<Integer> findDifferenceSet(Set<Integer> set1, Set<Integer> set2) {

        List<Integer> list = new ArrayList<>();
        for (Integer num : set1) {
            if (!set2.contains(num)) {
                list.add(num);
            }
        }

        return list;
    }
}