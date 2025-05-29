import java.util.Arrays;

class Solution {

    private static final int MOD = 1_000_000_007;

    public int numPrimeArrangements(int n) {

        int count = getPrimeCount(n);
        return (int) (factorial(count) * factorial(n - count) % MOD);
    }

    private static int getPrimeCount(int n) {

        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, 2, n + 1, true);

        for (int i = 0; i * i <= n; i++)
            if (prime[i])
                for (int j = i * i; j <= n; j += i)
                    prime[j] = false;

        int count = 0;
        for (boolean p : prime)
            if (p) count++;

        return count;
    }

    private static long factorial(int n) {

        long ans = 1;
        for (int i = 2; i <= n; i++)
            ans = ans * i % MOD;

        return ans;
    }
}