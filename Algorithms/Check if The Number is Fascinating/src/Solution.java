class Solution {
    public boolean isFascinating(int n) {

        int[] count = new int[10];
        for (int i = 1; i < 4; i++)
            fascinating(n * i, count);

        if (count[0] != 0) return false;
        for (int i = 1; i < count.length; i++)
            if (count[i] != 1) return false;

        return true;
    }

    private static void fascinating(int n, int[] count) {

        while (n > 0) {
            count[n % 10]++;
            n /= 10;
        }
    }
}