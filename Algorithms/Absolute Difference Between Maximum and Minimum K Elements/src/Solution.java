import java.util.Arrays;

class Solution {
    public int absDifference(int[] nums, int k) {

        int max = 0, min = 0, n = nums.length - 1;
        Arrays.sort(nums);
        for (int i = 0; i < k; i++) {
            min += nums[i];
            max += nums[n - i];
        }

        return max - min;
    }
}