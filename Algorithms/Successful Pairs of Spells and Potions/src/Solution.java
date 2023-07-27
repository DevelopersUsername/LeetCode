import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        int i = 0;
        int[] ans = new int[spells.length];

        Arrays.sort(potions);
        for (int spell : spells) {

            int l = 0, r = potions.length;
            while (l < r) {
                int m = l + (r - l) / 2;
                if ((long) potions[m] * spell < success) l = ++m;
                else r = m;
            }

            ans[i++] = potions.length - l;
        }

        return ans;
    }
}