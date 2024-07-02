class Solution {
    public int minMaxGame(int[] nums) {

        if(nums.length == 1) return nums[0];
        else {

            int[] t = new int[nums.length / 2];
            for (int i = 0, j = 0; i < nums.length - 1; i++)
                if (j % 2 == 1) t[j++] = Math.max(nums[i], nums[i++ + 1]);
                else t[j++] = Math.min(nums[i], nums[i++ + 1]);
            nums = t;
        }

        return minMaxGame(nums);
    }
}