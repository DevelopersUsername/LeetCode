import java.util.Arrays;

class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int l = 1, r = Arrays.stream(piles).max().getAsInt();
        if (piles.length == h) return r;

        while (l < r) {
            int m = l + (r - l) / 2;
            if (canEat(m, piles, h)) r = m;
            else l = m + 1;
        }

        return l;
    }

    private boolean canEat(int val, int[] piles, int h) {

        int time = 0;
        for (int pile : piles) {
            time += pile / val;
            if (pile % val > 0) time++;
        }

        return time <= h;
    }
}