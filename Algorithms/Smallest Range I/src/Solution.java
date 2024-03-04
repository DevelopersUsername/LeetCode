class Solution {
    public int smallestRangeI(int[] nums, int k) {

        if (nums.length < 2) return 0;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return Math.max(0, max - min - 2 * k);
    }
}