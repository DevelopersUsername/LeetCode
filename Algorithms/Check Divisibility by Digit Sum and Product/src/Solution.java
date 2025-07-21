class Solution {
    public boolean checkDivisibility(int n) {
        return n % (getSum(n) + getProduct(n)) == 0;
    }

    private static int getSum(int num) {

        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    private static int getProduct(int num) {

        int product = 1;
        while (num != 0) {
            product *= num % 10;
            num /= 10;
        }

        return product;
    }
}