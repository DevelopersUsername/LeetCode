class Solution {
    public long sumAndMultiply(int n) {

        long sum = 0, x = 0, num = 1;

        while (n > 0) {
            sum += n % 10;
            if (n % 10 != 0) {
                x += (n % 10) * num;
                num *= 10;
            }
            n /= 10;
        }

        return sum * x;
    }
}