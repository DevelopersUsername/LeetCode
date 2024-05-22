class Solution {
    public int minOperations(int[] nums, int k) {

        int x = nums[0];
        for (int i = 1; i < nums.length; i++) x ^= nums[i];

        return Integer.bitCount(k ^ x);
    }
}