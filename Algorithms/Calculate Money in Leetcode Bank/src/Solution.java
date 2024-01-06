class Solution {
    public int totalMoney(int n) {

        int weeks = n / 7, ans = (weeks * (2 * 28 + (weeks - 1) * 7)) / 2;
        for (int day = 0; day < n % 7; day++)
            ans += weeks + day + 1;

        return ans;
    }
}