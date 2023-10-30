class Solution {
    public int removeDuplicates(int[] nums) {

        int ans = 0;
        for (int num : nums)
            if (ans < 2 || num > nums[ans - 2]) nums[ans++] = num;

        return ans;
    }
}