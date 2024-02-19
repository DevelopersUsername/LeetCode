class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 1) return true;
        else if (n < 0) return false;
        else return (Math.log10(n) / Math.log10(4)) % 1 == 0;
    }
}