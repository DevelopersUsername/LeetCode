class Solution {
    public int[] leftRigthDifference(int[] nums) {

        int t = 0;
        int[] result = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i-1] + nums[i-1];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = Math.abs(result[i] - t);
            t += nums[i];
        }

        return result;
    }
}