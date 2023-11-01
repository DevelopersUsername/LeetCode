class Solution {
    public boolean canJump(int[] nums) {

        int jump = 0, l = nums.length;
        for (int reach = 0; jump < l && jump <= reach; jump++) reach = Math.max(reach, jump + nums[jump]);

        return jump == l;
    }
}