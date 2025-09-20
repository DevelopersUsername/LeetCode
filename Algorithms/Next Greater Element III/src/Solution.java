class Solution {
    public int nextGreaterElement(int n) {
        long ans = Long.parseLong(nextPermutation(String.valueOf(n).toCharArray()));
        return ans > Integer.MAX_VALUE || ans <= (long) n ? -1 : (int) ans;
    }

    private String nextPermutation(char[] s) {
        final int n = s.length;

        int i;
        for (i = n - 2; i >= 0; i--)
            if (s[i] < s[i + 1]) break;

        if (i >= 0) {
            for (int j = n - 1; j > i; j--)
                if (s[j] > s[i]) {
                    swap(s, i, j);
                    break;
                }
        }

        reverse(s, i + 1, n - 1);
        return new String(s);
    }

    private static void reverse(char[] s, int l, int r) {
        while (l < r)
            swap(s, l++, r--);
    }

    private static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}