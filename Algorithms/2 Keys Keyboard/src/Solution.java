class Solution {
    public int minSteps(int n) {

        if (n == 1) return 0;
        else if (n == 2) return 2;

        int ans = n;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                ans = Math.min(ans, minSteps(n / i) + i);

        return ans;
    }
}