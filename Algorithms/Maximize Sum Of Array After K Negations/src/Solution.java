import java.util.Arrays;

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {

        int ans = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 || k == 0) break;
            nums[i] *= -1;
            k--;
        }

        k %= 2;
        if (k > 0) {
            Arrays.sort(nums);
            nums[0] *=-1;
        }

        for (int num : nums)
            ans += num;

        return ans;
    }
}