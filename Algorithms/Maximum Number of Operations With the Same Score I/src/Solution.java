class Solution {
    public int maxOperations(int[] nums) {

        if (nums.length < 4) return 1;

        int ans = 1, score = nums[0] + nums[1];

        for (int i = 3; i < nums.length; i += 2)
            if (nums[i] + nums[i - 1] == score) ans++;
            else break;

        return ans;
    }
}