class Solution {

    final static int MOD = 1_000_000_007;

    public int lengthAfterTransformations(String s, int t) {

        int ans = 0;
        int[] count = new int[26];
        for (char c : s.toCharArray())
            count[c - 'a']++;

        while (t-- > 0) {
            int[] copy = new int[26];
            for (int i = 0; i < 25; i++)
                copy[i + 1] = count[i] % MOD;
            copy[0] = count[25] % MOD;
            copy[1] = (copy[1] + count[25]) % MOD;
            count = copy;
        }

        for (int c : count) ans = (ans + c) % MOD;

        return ans;
    }
}