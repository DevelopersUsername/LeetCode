class Solution {
    public int findGCD(int[] nums) {

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return gcd(min, max);
    }

    private int gcd(int a, int b) {

        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}