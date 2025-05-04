class Solution {
    public int maxProduct(int n) {

        int max1 = 0, max2 = 0;

        while (n > 0) {

            int t = n % 10;
            if (t > max1) {
                max2 = max1;
                max1 = t;
            } else if (t > max2) max2 = t;

            n /= 10;
        }

        return max1 * max2;
    }
}