class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        for (int i = 0; i < k; i++) {

            int minVal = nums[0], minIndex = 0;
            for (int j = 1; j < nums.length; j++) {

                if (nums[j] < minVal) {
                    minVal = nums[j];
                    minIndex = j;
                }
            }

            nums[minIndex] = nums[minIndex] * multiplier;
        }


        return nums;
    }
}