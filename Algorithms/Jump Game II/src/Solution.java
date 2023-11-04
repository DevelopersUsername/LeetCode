class Solution {
    public int jump(int[] nums) {

        int ans = 0, n = nums.length - 1, jump = 0, maxJump = 0;
        for (int position = 0; position < n; position++) {

            maxJump = Math.max(maxJump, nums[position] + position);
            if (maxJump >= n) return ++ans;
            else if (position == jump) {
                ans++;
                jump = maxJump;
            }
        }

        return ans;
    }
}