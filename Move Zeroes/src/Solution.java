class Solution {
    public void moveZeroes(int[] nums) {

        int id = 0;
        for (int elem : nums) {
            if (elem != 0) {
                nums[id++] = elem;
            }
        }

        for (int i = id; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}