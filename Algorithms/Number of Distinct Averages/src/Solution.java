import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int distinctAverages(int[] nums) {

        Arrays.sort(nums);

        Set<Double> set = new HashSet<>();
        for (int l = 0, r = nums.length - 1; l < nums.length / 2; l++, r--)
            set.add((((double) nums[l] + nums[r]) / 2));

        return set.size();
    }
}