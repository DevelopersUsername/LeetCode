class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int ans = 0, t = 0;
        for (int num : nums)
            if (num == 1) t++;
            else {
                ans = Math.max(ans, t);
                t = 0;
            }

        return Math.max(ans, t);
    }
}