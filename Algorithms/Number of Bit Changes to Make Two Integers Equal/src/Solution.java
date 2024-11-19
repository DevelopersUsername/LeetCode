class Solution {
    public int minChanges(int n, int k) {

        if (n == k) return 0;

        String nBits = Integer.toBinaryString(n);
        String kBits = Integer.toBinaryString(k);

        if (nBits.length() < kBits.length()) return -1;

        int ans = 0;
        for (int i = kBits.length() - 1, j = nBits.length() - 1; i >= 0; i--, j--)
            if (nBits.charAt(j) == '1' && kBits.charAt(i) == '0')
                ans++;
            else if (nBits.charAt(j) == '0' && kBits.charAt(i) == '1')
                return -1;

        for (int i = 0; i < nBits.length() - kBits.length(); i++)
            if (nBits.charAt(i) == '1') ans++;

        return ans;
    }
}