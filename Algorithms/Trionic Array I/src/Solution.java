class Solution {
    public boolean isTrionic(int[] nums) {

        int n = nums.length;
        if (n < 4) return false;

        int pos = incPos(nums, 0, -1001);
        if (pos < 2) return false;
        pos = decPos(nums, pos, nums[pos - 1]);
        if (pos == n) return false;
        pos = incPos(nums, pos, nums[pos - 1]);

        return pos == n;
    }

    private static int incPos(int[] nums, int pos, int prev) {

        for (int i = pos; i < nums.length; i++)
            if (nums[i] > prev) {
                pos++;
                prev = nums[i];
            } else break;

        return pos;
    }

    private static int decPos(int[] nums, int pos, int prev) {

        for (int i = pos; i < nums.length; i++)
            if (nums[i] < prev) {
                pos++;
                prev = nums[i];
            } else break;

        return pos;
    }
}