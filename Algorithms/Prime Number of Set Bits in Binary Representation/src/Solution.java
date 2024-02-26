import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {

    private static final Set<Integer> primes = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));

    public int countPrimeSetBits(int left, int right) {

        int ans = 0;
        for (int i = left; i <= right; i++) if (isPrime(i)) ans++;

        return ans;
    }

    private boolean isPrime(int num) {

        int bits = 0;
        for (int i = num; i > 0; i >>= 1) bits += i & 1;

        return primes.contains(bits);
    }
}