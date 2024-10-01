import java.util.Arrays;

class Solution {
    public int minimumPushes(String word) {

        int ans = 0, coeff = 1;

        int[] count = new int[26];
        for (char c : word.toCharArray())
            count[c - 'a']++;

        Arrays.sort(count);
        for (int i = 25; i >= 0; i--) {
            if (count[i] == 0) break;
            ans += coeff;
            if ((26 - i) % 8 == 0) coeff++;
        }

        return ans;
    }
}