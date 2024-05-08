class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {

        if (x < 10) return x;

        int sum = 0, t = x;
        while (t > 0) {
            sum += t % 10;
            t /= 10;
        }

        return x % sum == 0 ? sum : -1;
    }
}