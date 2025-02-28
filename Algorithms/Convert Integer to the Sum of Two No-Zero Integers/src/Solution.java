class Solution {
    public int[] getNoZeroIntegers(int n) {

        for (int num = 1; num < n; num++)
            if (noZero(n - num) && noZero(num))
                return new int[]{n - num, num};

        return new int[]{};
    }

    private static boolean noZero(int num) {

        while (num != 0)
            if (num % 10 == 0) return false;
            else num /= 10;

        return true;
    }
}