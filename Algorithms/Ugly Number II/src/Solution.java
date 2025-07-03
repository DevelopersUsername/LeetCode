class Solution {
    public int nthUglyNumber(int n) {

        int[] nums = new int[n + 1];

        int i = 1, i2 = 1, i3 = 1, i5 = 1, ug2 = 1, ug3 = 1, ug5 = 1;
        while (i <= n) {

            int min = Math.min(ug2, Math.min(ug3, ug5));
            nums[i++] = min;
            if (min == ug2) ug2 = 2 * nums[i2++];
            if (min == ug3) ug3 = 3 * nums[i3++];
            if (min == ug5) ug5 = 5 * nums[i5++];
        }

        return nums[n];
    }
}