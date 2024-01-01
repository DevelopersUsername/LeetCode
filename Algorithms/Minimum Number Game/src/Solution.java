import java.util.Arrays;

class Solution {
    public int[] numberGame(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[++i] = temp;
        }

        return nums;
    }
}