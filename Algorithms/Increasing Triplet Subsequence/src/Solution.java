class Solution {
    public boolean increasingTriplet(int[] nums) {

        if (nums.length < 3) return false;

        int t1 = Integer.MAX_VALUE, t2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= t1) t1 = num;
            else if (num <= t2) t2 = num;
            else return true;

        }

        return false;
    }
}