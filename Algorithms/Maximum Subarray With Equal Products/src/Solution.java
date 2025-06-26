class Solution {

    final static int MAX_LCM = 36_288_000;

    public int maxLength(int[] nums) {

        int ans = 0, n = nums.length;

        for (int i = 0; i < n; i++) {
            int prod = 1;
            int l = 1;
            int g = 0;
            for (int j = i; j < n; j++) {
                prod *= nums[j];
                if (prod > MAX_LCM) break;
                l = lcm(l, nums[j]);
                g = gcd(g, nums[j]);
                if (prod == l * g)
                    ans = Math.max(ans, j - i + 1);
            }
        }

        return ans;
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
}