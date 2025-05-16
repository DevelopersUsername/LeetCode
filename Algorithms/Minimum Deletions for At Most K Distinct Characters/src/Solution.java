import java.util.Arrays;

class Solution {
    public int minDeletion(String s, int k) {

        int[] freq = new int[26];
        for (char c : s.toCharArray())
            freq[c - 'a']++;

        int sum = 0, ans = 0;
        for (int i : freq)
            sum += i;
        if (sum <= k) return ans;

        Arrays.sort(freq);
        for (int i = freq.length - 1; i >= 0; i--) {
            if (k == 0) break;
            if (freq[i] != 0) {
                k--;
                ans += freq[i];
            }
        }

        return s.length() - ans;
    }
}