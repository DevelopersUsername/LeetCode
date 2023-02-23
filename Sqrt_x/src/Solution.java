class Solution {
    public int mySqrt(int x) {

        /*
        Approach

        Initial number - x
        Right search border - right, left - left

        1. Set the left border to 1
        2. Find the middle of the search area middle = (left+right)/2
        3. If x / 2 == middle => we have found the root of x
        4. If middle > x / middle => middle is to the right of the desired number, we shift the right border, otherwise we shift the left border

        Time complexity: 𝑂(log⁡𝑛)
        */

        int l = 1;
        int r = x;
        while (l <= r) {

            int mid = (l + r) / 2;

            if (x / mid == mid) {
                return mid;
            } else if (mid > x / mid) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return r;
    }
}