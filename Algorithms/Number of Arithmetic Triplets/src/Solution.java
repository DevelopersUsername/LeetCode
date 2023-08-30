class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {

        int ans = 0;
        boolean[] t = new boolean[201];

        for (int num : nums) {
            if (num >= 2 * diff && t[num - diff] && t[num - 2 * diff]) ans++;
            t[num] = true;
        }

        return ans;
    }
}