class Solution {

    int ans = 0;

    public int subsetXORSum(int[] nums) {

        if(nums.length == 1) return nums[0];
        else xorSum(nums, 0, 0);

        return ans;
    }

    private void xorSum(int[] nums, int index, int xor) {
        if (index == nums.length) {
            ans += xor;
            return;
        }

        xorSum(nums, index + 1, xor ^ nums[index]);
        xorSum(nums, index + 1, xor);
    }
}