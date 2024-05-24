import java.util.Arrays;

class Solution {
    public int maxCoins(int[] piles) {

        int ans = 0, l = 0, r = piles.length - 1;

        Arrays.sort(piles);
        while (l < r) {
            l++;
            r--;
            ans += piles[r--];
        }

        return ans;
    }
}