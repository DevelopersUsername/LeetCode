class Solution {
    public int pivotIndex(int[] nums) {

        int sum = 0, t = 0;
        for (int num : nums)
            sum += num;

        for (int i = 0; i < nums.length; i++) {

            if (sum - nums[i] == t) return i;
            else {
                t += nums[i];
                sum -= nums[i];
            }
        }

        return -1;
    }
}