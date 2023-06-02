class Solution {
    public boolean divideArray(int[] nums) {

        int[] temp = new int[501];
        for (int num : nums) {
            temp[num]++;
        }

        for (int j : temp) {
            if (j % 2 == 1) {
                return false;
            }
        }

        return true;
    }
}