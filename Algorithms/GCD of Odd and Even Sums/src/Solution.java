import java.math.BigInteger;

class Solution {
    public int gcdOfOddEvenSums(int n) {

        int oddSum = 0, evenSum = 0;
        for (int i = 1; i <= n * 2; i++)
            if (i % 2 == 0) oddSum += i;
            else evenSum += i;

        return BigInteger.valueOf(oddSum).gcd(BigInteger.valueOf(evenSum)).intValue();
    }
}