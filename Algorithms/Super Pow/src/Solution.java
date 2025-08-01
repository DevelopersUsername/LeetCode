class Solution {
    private static final int MOD = 1337;
    public int superPow(int a, int[] b) {
        int ans = 1;

        a %= MOD;
        for (int num : b)
            ans = modPow(ans, 10) * modPow(a, num) % MOD;

        return ans;
    }

    private int modPow(int x, int n) {

        if (n == 0) return 1;
        else if (n % 2 == 1) return x * modPow(x % MOD, (n - 1)) % MOD;
        else return modPow(x * x % MOD, (n / 2)) % MOD;
    }
}