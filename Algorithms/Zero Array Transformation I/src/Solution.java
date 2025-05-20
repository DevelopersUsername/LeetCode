class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {

        int[] sum = new int[nums.length + 1];
        for (int[] query : queries) {
            sum[query[0]]++;
            sum[query[1] + 1]--;
        }

        int dec = 0;
        for (int i = 0; i < nums.length; i++) {
            dec += sum[i];
            if (dec < nums[i])
                return false;
        }

        return true;
    }
}