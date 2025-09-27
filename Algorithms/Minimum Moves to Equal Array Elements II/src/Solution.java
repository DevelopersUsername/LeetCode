import java.util.Arrays;

class Solution {
    public int minMoves2(int[] nums) {

        int ans = 0, n = nums.length, m = n / 2;
        Arrays.sort(nums);

        for (int num : nums)
            ans += Math.abs(num - nums[m]);

        return ans;
    }
}