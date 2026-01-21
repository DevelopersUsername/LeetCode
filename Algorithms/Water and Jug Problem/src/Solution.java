class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        return target == 0 || x + y >= target && target % gcd(x, y) == 0;
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}