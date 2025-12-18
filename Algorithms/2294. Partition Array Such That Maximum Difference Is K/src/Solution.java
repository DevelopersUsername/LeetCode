import java.util.Arrays;

class Solution {
    public int partitionArray(int[] nums, int k) {

        Arrays.sort(nums);

        int ans = 1, t = nums[0];

        for (int i = 1; i < nums.length; i++)
            if (t + k < nums[i]) {
                ans++;
                t = nums[i];
            }

        return ans;
    }
}