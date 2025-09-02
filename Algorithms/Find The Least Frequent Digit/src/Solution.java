class Solution {
    public int getLeastFrequentDigit(int n) {

        int[] count = new int[10];

        int minFreq = Integer.MAX_VALUE;
        while (n > 0) {
            count[n % 10]++;
            n /= 10;
        }

        for (int i = 0; i < 10; i++)
            if (count[i] != 0) minFreq = Math.min(minFreq, count[i]);

        for (int i = 0; i < 10; i++)
            if (count[i] == minFreq) return i;

        return -1;
    }
}