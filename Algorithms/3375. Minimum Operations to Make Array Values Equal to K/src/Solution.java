import java.util.HashSet;
import java.util.Set;

class Solution {
    public int minOperations(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            set.add(num);
            if (num < k) return -1;
            else min = Math.min(min, num);
        }

        if (min > k) return set.size();
        else return set.size() - 1;
    }
}