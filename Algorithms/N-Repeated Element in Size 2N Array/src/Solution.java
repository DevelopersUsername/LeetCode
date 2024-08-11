import java.util.HashSet;
import java.util.Set;

class Solution {
    public int repeatedNTimes(int[] nums) {

        Set<Integer> set = new HashSet<>(nums.length / 2 + 1);
        for (int num : nums)
            if (set.contains(num)) return num;
            else set.add(num);

        return -1;
    }
}