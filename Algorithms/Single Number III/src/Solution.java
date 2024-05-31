import java.util.Arrays;

class Solution {
    public int[] singleNumber(int[] nums) {

        int[] ans = new int[2];
        Arrays.sort(nums);

        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) i++;
            else ans[count++] = nums[i];

            if (count == 2) return ans;
        }

        ans[count] = nums[nums.length - 1];

        return ans;
    }
}