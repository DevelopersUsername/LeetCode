class Solution {
    public int findKOr(int[] nums, int k) {

        int ans = 0, count;
        for (int i = 0; i < 32; i++) {
            count = 0;
            for (int num : nums)
                count += num >> i & 1;
            if (count >= k)
                ans += (int) Math.pow(2, i);
        }

        return ans;
    }
}