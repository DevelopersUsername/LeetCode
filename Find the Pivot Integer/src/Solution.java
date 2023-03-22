class Solution {
    public int pivotInteger(int n) {

        double result =  Math.sqrt(n * (n + 1) / 2);
        if(result % 1 == 0)
            return Double.valueOf(result).intValue();

        return -1;
    }

    private static int pivotInteger_bruteforce(int n) {

        int result = -1;
        int endIndex = n;
        int start = 0;
        int end = 0;

        for (int i = 1; i <= n; i++) {

            if (i == endIndex && start == end)
                return i;

            start += i;
            if (start > end) {
                end += endIndex;
                endIndex--;
            }

        }

        return result;
    }
}