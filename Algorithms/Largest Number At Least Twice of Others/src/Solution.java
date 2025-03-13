class Solution {
    public int dominantIndex(int[] nums) {

        int max1 = 0, max2 = 0, ans = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
                ans = i;
            } else if (nums[i] > max2)
                max2 = nums[i];

        if (max2 == 0 || max1 / max2 >= 2) return ans;
        else return -1;
    }
}