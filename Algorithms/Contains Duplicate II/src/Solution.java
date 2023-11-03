import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if (nums.length < 2 || k == 0) return false;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++)
            if (!set.add(nums[i])) return true;
            else if (i >= k) set.remove(nums[i - k]);

        return false;
    }
}