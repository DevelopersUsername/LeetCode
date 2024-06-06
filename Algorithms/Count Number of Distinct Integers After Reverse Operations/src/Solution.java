import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countDistinctIntegers(int[] nums) {

        Set<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) {
            set.add(num);
            if (num > 10) set.add(revert(num));
        }

        return set.size();
    }

    private static Integer revert(int num) {

        int n = 0;
        while (num > 0) {
            n = n * 10 + num % 10;
            num /= 10;
        }

        return n;
    }
}