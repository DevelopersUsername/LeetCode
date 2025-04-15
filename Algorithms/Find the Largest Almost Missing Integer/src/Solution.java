class Solution {
    public int largestInteger(int[] nums, int k) {

        int[] count = new int[51];
        int n = nums.length;

        for (int num : nums)
            count[num]++;

        if (n == k) return getMax(count);
        else if (k == 1) return getUniqueMax(count);
        else {

            int left = -1, right = -1;
            if (count[nums[0]] == 1) left = nums[0];
            if (count[nums[n - 1]] == 1) right = nums[n - 1];

            return Math.max(left, right);
        }
    }

    private static int getMax(int[] count) {

        for (int i = count.length - 1; i >= 0; i--)
            if (count[i] != 0) return i;
        return -1;
    }

    private static int getUniqueMax(int[] count) {

        for (int i = count.length - 1; i >= 0; i--)
            if (count[i] == 1) return i;
        return -1;
    }
}