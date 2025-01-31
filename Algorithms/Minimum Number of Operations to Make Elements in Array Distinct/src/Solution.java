import java.util.HashSet;
import java.util.Set;

class Solution {
    public int minimumOperations(int[] nums) {

        Set<Integer> visited = new HashSet<>();
        for (int i = nums.length - 1; i >= 0; i--)
            if (!visited.add(nums[i]))
                return (i + 3) / 3;

        return 0;
    }
}