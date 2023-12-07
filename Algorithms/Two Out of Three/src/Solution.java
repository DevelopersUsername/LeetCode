import java.util.*;

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        final List<Integer> ans = new ArrayList<>();

        int[] numsSet1 = fill(nums1), numsSet2 = fill(nums2), numsSet3 = fill(nums3);
        for (int i = 0; i < 101; i++) if (numsSet1[i] + numsSet2[i] + numsSet3[i] > 1) ans.add(i);

        return ans;
    }

    private int[] fill(int[] nums) {

        int[] numsSet = new int[101];
        for (int num : nums) numsSet[num] = 1;

        return numsSet;
    }
}