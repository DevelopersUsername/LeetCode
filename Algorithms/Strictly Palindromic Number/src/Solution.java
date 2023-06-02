class Solution {
    public boolean isStrictlyPalindromic(int n) {

        for (int i = 2; i <= n-2; i++) {

            if (!isPalindromic(i, n))
                return false;
        }

        return true;
    }

    private boolean isPalindromic (int base, int num) {

        StringBuilder builder = new StringBuilder();
        int t = num;

        while (t > 0) {
            builder.append(t % base);
            t /= base;
        }

        return builder.toString().contentEquals(builder.reverse());
    }
}