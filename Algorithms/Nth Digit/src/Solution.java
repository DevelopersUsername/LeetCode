class Solution {
    public int findNthDigit(int n) {

        int digitSize = 1, startNum = 1;
        long count = 9;

        while (digitSize * count < n) {
            n -= (int) (digitSize * count);
            digitSize++;
            startNum *= 10;
            count *= 10;
        }

        return String.valueOf(startNum + (n - 1) / digitSize).charAt((n - 1) % digitSize) - '0';
    }
}