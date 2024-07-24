class Solution {
    public boolean isPossibleToSplit(int[] nums) {

        int[] count = new int[101];
        for (int num : nums)
            if (++count[num] > 2)
                return false;

        return true;
    }
}