class Solution {
    public boolean hasTrailingZeros(int[] nums) {

        int count = -1;
        for (int num : nums)
            if ((num & 1) == 0 && ++count == 1) return true;

        return false;
    }
}