class Solution {
    public long minSum(int[] nums1, int[] nums2) {

        long sum1 = 0, sum2 = 0, zeros1 = 0, zeros2 = 0;

        for (int num : nums1)
            if (num != 0) sum1 += num;
            else zeros1++;
        for (int num : nums2)
            if (num != 0) sum2 += num;
            else zeros2++;

        if ((zeros1 == 0 && sum1 < sum2 + zeros2)
                || (zeros2 == 0 && sum2 < sum1 + zeros1)) return -1;
        else return Math.max(sum1 + zeros1, sum2 + zeros2);
    }
}