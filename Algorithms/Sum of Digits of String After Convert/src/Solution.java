class Solution {
    public int getLucky(String s, int k) {

        int ans = convert(s);
        for (int i = 1; i < k; ++i)
            ans = transform(ans);

        return ans;
    }

    private static int convert(String s) {

        int sum = 0;
        for (char c : s.toCharArray()) {
            int val = c - 'a' + 1;
            sum += val < 10 ? val : (val % 10 + val / 10);
        }

        return sum;
    }

    private static int transform(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}