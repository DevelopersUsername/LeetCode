class Solution {
    public int findTheWinner(int n, int k) {

        if (n < 2) return 1;

        int ans = 0;
        for (int i = 2; i <= n; i++)
            ans = (ans + k) % i;

        return ++ans;
    }
}