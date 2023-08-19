class Solution {
    public int rob(int[] nums) {

        int cur = 0, prev = 0;
        for (int num : nums) {
            int t = Math.max(cur, prev + num);
            prev = cur;
            cur = t;
        }

        return cur;
    }
}