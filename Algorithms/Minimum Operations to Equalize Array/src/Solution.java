class Solution {
    public int minOperations(int[] nums) {

        int count = 1, n = nums.length;
        for (int i = 1; i < n; i++)
            if (nums[i] == nums[i - 1]) count++;

        return count == n ? 0 : 1;
    }
}