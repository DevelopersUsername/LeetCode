class Solution {
    public int findMiddleIndex(int[] nums) {

        int pref = 0, suf = 0;
        for (int num : nums) suf += num;

        for (int i = 0; i < nums.length; i++) {
            suf -= nums[i];
            if (suf == pref) return i;
            else pref += nums[i];
        }

        return -1;
    }
}