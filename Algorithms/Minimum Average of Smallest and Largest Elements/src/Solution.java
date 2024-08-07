import java.util.Arrays;

class Solution {
    public double minimumAverage(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);

        double ans = Double.MAX_VALUE;
        for (int i = 0; i < n / 2; i++)
            ans = Math.min((double) (nums[i] + nums[n - 1 - i]) / 2, ans);

        return ans;
    }
}