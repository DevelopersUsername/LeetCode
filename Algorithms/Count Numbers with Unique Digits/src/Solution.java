class Solution {
    public int countNumbersWithUniqueDigits(int n) {

        if (n == 0) return 1;

        int ans = 10, unique = 9;
        for (int num = 9; n > 1 && num > 0; n--, num--) {
            unique *= num;
            ans += unique;
        }

        return ans;
    }
}