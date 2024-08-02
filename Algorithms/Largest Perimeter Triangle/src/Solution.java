import java.util.Arrays;

class Solution {
    public int largestPerimeter(int[] nums) {

        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--)
            if (isValid(nums[i], nums[i - 1], nums[i - 2]))
                return nums[i] + nums[i - 1] + nums[i - 2];

        return 0;
    }

    private static boolean isValid(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}