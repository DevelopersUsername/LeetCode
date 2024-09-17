class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {

        int ans = Integer.MAX_VALUE, count, n;

        for (int i = 0; i < nums.length; i++) {

            n = nums[i];
            count = 1;
            if (n >= k) {
                ans = Math.min(ans, count);
                break;
            }

            for (int j = i + 1; j < nums.length; j++) {

                n |= nums[j];
                count++;

                if (n >= k) {
                    ans = Math.min(ans, count);
                    break;
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}