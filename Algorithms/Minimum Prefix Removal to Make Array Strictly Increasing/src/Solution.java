class Solution {
    public int minimumPrefixLength(int[] nums) {

        int n = nums.length - 1, ans = n, next = nums[n];
        while (--ans >= 0)
            if (nums[ans] < next) next = nums[ans];
            else return ++ans;

        return 0;
    }
}