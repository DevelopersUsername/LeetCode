import java.util.Arrays;

class Solution {
    public int countElements(int[] nums) {

        int smallest = 1, greatest = 1, n = nums.length;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++)
            if (nums[i] == nums[0]) smallest++;
            else break;

        for (int i = n - 2; i >= 0; i--)
            if (nums[n - 1] == nums[i]) greatest++;
            else break;

        return Math.max(0, n - smallest - greatest);
    }
}