import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int ans = 0, n = nums.length;
        for (int i = 0; i < 3; i++) ans += nums[i];
        if (n == 3) return ans;

        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) return target;
                if (Math.abs(sum - target) < Math.abs(ans - target)) ans = sum;
                if (sum < target) left++;
                else right--;
            }
        }

        return ans;
    }
}