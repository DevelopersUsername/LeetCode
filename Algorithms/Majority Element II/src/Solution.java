import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        if (nums.length == 1) {
            ans.add(nums[0]);
            return ans;
        }

        Arrays.sort(nums);
        int majority = nums.length / 3, count = 1, prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev) count++;
            else {
                if (count > majority) ans.add(prev);
                count = 1;
                prev = nums[i];
            }

            if (i == nums.length - 1 && count > majority) ans.add(prev);
        }

        return ans;
    }
}