import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] numberOfPairs(int[] nums) {

        int pairs = 0;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                set.remove(num);
                pairs++;
            } else
                set.add(num);
        }

        return new int []{pairs, nums.length - pairs * 2};
    }
}