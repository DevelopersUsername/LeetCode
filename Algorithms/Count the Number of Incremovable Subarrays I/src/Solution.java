import java.util.Arrays;

class Solution {
    public int incremovableSubarrayCount(int[] nums) {

        int n = nums.length, start = getStart(nums);
        if (start == 0)
            return n * (n + 1) / 2;

        int ans = n - start + 1;
        for (int i = 0; i < start; i++) {
            if (i > 0 && nums[i] <= nums[i - 1])
                break;
            ans += n - firstGreater(nums, start, nums[i] + 1) + 1;
        }

        return ans;
    }

    private int getStart(int[] nums) {

        for (int i = nums.length - 2; i >= 0; i--)
            if (nums[i] >= nums[i + 1])
                return i + 1;

        return 0;
    }

    private int firstGreater(int[] arr, int start, int target) {

        int greater = Arrays.binarySearch(arr, start, arr.length, target);

        return greater < 0 ? -greater - 1 : greater;
    }
}