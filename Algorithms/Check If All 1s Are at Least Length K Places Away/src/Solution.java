class Solution {
    public boolean kLengthApart(int[] nums, int k) {

        int count = 0;
        boolean flag = false;
        for (int num : nums) {
            if (num == 0) count++;
            else if (flag && count < k) return false;
            else {
                count = 0;
                flag = true;
            }
        }

        return true;
    }
}