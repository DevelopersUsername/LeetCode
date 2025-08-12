class Solution {
    public int minMoves(int[] nums) {

        int sum = 0, min = Integer.MAX_VALUE, n = nums.length;
        for (int num : nums) {
            sum += num;
            min = Math.min(min, num);
        }

        return sum - min * n;
    }
}