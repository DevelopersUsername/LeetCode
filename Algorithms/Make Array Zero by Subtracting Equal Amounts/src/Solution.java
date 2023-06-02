import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public int minimumOperations(int[] nums) {

        Set<Integer> set = new LinkedHashSet<>();
        for (int elem : nums) {
            if (elem != 0)
                set.add(elem);
        }

        return set.size();
    }
}