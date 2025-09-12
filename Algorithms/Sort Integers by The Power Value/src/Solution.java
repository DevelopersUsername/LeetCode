import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int getKth(int lo, int hi, int k) {

        int[][] power = new int[hi - lo + 1][2];

        for (int i = lo; i <= hi; i++)
            power[i - lo] = new int[]{getPow(i), i};
        Arrays.sort(power, Comparator.comparingInt(powAndVal -> powAndVal[0]));

        return power[k - 1][1];
    }

    private static int getPow(int n) {
        if (n == 1) return 0;
        else return 1 + (n % 2 == 0 ? getPow(n / 2) : getPow(n * 3 + 1));
    }
}