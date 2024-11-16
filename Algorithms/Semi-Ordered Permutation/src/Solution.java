class Solution {
    public int semiOrderedPermutation(int[] nums) {

        int n = nums.length, f = 0, l = 0;
        for (int i = 0; i < n; i++)
            if (nums[i] == 1)
                f = i;
            else if (nums[i] == n)
                l = i;

        int k = f < l ? 1 : 2;

        return f + n - l - k;
    }
}