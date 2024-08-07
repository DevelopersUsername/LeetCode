class Solution {
    public int divisorSubstrings(int num, int k) {

        int ans = 0;
        String s = String.valueOf(num);

        for (int i = 0; i <= s.length() - k; i++) {
            int t = Integer.parseInt(s.substring(i, i + k));
            if (t != 0 && num % t == 0) ans++;
        }

        return ans;
    }
}