class Solution {
    public int findLengthOfLCIS(int[] nums) {

        int ans = 0, seq = 0, prev = 0;

        for (int num : nums) {
            if (num > prev) seq++;
            else seq = 1;

            prev = num;
            ans = Math.max(ans, seq);
        }

        return ans;
    }
}