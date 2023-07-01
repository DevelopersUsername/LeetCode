class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int prev = 0, next;
        for (int i = 0; i < flowerbed.length; i++) {

            if (n == 0)
                return true;

            if (i == flowerbed.length - 1) next = 0;
            else next = flowerbed[i + 1];

            if (flowerbed[i] == 0 && prev == 0 && next == 0) {
                n--;
                prev = 1;
            } else {
                prev = flowerbed[i];
            }

        }

        return n == 0;
    }
}