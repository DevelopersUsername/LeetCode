import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestBalanced(int[] nums) {

        int ans = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            Set<Integer> visited = new HashSet<>();
            int[] count = new int[2];
            for (int j = i; j < n; j++) {
                if (visited.add(nums[j]))
                    count[nums[j] & 1]++;
                if (count[0] == count[1])
                    ans = Math.max(ans, j - i + 1);
            }
        }

        return ans;
    }
}