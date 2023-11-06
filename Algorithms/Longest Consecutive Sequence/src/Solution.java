import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        int ans = 1, sequence = 1, prev = nums[0];
        for (int num : nums) {
            if (prev + 1 == num) ans = Math.max(ans, ++sequence);
            else if (prev != num) sequence = 1;
            prev = num;
        }

        return ans;
    }

    public int longestConsecutive_HashSet (int[] nums) {

        if (nums.length == 0) return 0;
        int ans = 1, sequence;

        Set<Integer> elements = new HashSet<>();
        for (int num : nums) elements.add(num);

        for (int num : nums) {
            if (elements.contains(num - 1)) continue;
            sequence = 1;
            while (elements.contains(++num)) sequence++;
            ans = Math.max(ans, sequence);
        }

        return ans;
    }
}