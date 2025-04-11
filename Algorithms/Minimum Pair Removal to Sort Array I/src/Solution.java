class Solution {
    public int minimumPairRemoval(int[] nums) {

        int ans = 0;
        while (!isNonDecreasing(nums)) {
            nums = dropPair(nums);
            ans++;
        }

        return ans;
    }

    private static boolean isNonDecreasing(int[] nums) {

        int prev = Integer.MIN_VALUE;
        for (int num : nums)
            if (prev > num) return false;
            else prev = num;

        return true;
    }

    private static int[] dropPair(int[] nums) {

        int minIndex = getMinIndex(nums), n = nums.length;
        if (minIndex == -1) return nums;

        nums[minIndex] = nums[minIndex] + nums[minIndex + 1];
        int[] copy = new int[n - 1];
        System.arraycopy(nums, 0, copy, 0, minIndex + 1);
        System.arraycopy(nums, minIndex + 2, copy, minIndex + 1, n - minIndex - 2);
        return copy;
    }

    private static int getMinIndex(int[] nums) {

        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i] + nums[i + 1];
            if (sum < min) {
                min = sum;
                minIndex = i;
            }
        }

        return minIndex;
    }
}