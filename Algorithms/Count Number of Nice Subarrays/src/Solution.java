class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        int ans = 0, l = 0, r = 0, lMax = 0;
        while (r < nums.length) {

            if (nums[r] % 2 == 1) k--;

            while (k < 0) {
                if (nums[l] % 2 == 1) k++;
                l++;
                lMax = l;
            }

            if (k == 0) {
                while (nums[lMax] % 2 != 1) lMax++;
                ans += lMax - l + 1;
            }

            r++;
        }

        return ans;
    }
}