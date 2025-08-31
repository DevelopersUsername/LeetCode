class Solution {
    public boolean checkPowersOfThree(int n) {

        while (n > 1) {
            int t = n % 3;
            if (t == 2) return false;
            n /= 3;
        }

        return true;
    }
}