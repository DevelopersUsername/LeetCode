class Solution {
    public int missingInteger(int[] nums) {

        int ans = nums[0];

        int[] count = new int[52];
        for (int num : nums) count[num]++;

        for (int i = 1; i < nums.length; i++)
            if (nums[i] != nums[i - 1] + 1) break;
            else ans += nums[i];

        for (int i = ans; i < count.length; i++)
            if (count[i] == 0) return i;

        return ans;
    }
}