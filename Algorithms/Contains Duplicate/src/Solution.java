import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (Integer num : nums) {

            if (set.contains(num))
                return true;
            else
                set.add(num);
        }

        return false;
    }
}