class Solution {
    public int mySqrt(int x) {

        int t = 1;
        int r = x;
        while (t <= r) {
            int mid = (t + r) / 2;
            if (x / mid == mid) {
                return mid;
            } else if (mid > x / mid) {
                r = mid - 1;
            } else {
                t = mid + 1;
            }
        }
        return r;
    }
}