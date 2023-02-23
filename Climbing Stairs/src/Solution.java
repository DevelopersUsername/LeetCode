class Solution {
    public int climbStairs(int n) {
        return variableSolution(n);
    }

    private int variableSolution(int n) {

        if (n < 2)
            return n;

        int prev = 1;
        int cur = 2;
        int next;

        for (int i = 3; i <= n; i++) {
            next = cur + prev;
            prev = cur;
            cur = next;
        }

        return cur;
    }
    private int arraySolution(int n) {

        if (n < 3)
            return n;

        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }
}