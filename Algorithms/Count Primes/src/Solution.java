import java.util.Arrays;

class Solution {
    public int countPrimes(int n) {

        if (n < 2) return 0;

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        isPrime[0] = false; isPrime[1] = false;
        for (int i = 2; i * i < n; i++)
            if (isPrime[i])
                for (int j = i * i; j < n; j += i)
                    isPrime[j] = false;

        int ans = 0;
        for (boolean num : isPrime)
            if (num) ans++;

        return ans;
    }
}