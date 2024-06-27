class Solution {
    public int countLargestGroup(int n) {

        int ans = 0, max = 0;
        int[] count = new int[37];
        for (int i = 1; i <= n; ++i)
            max = Math.max(max, ++count[digitSum(i)]);

        for (int i : count) if (i == max) ans++;

        return ans;
    }

    private static int digitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}