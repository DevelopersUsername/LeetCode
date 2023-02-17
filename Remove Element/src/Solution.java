public class Solution {
    public int removeElement(int[] nums, int val) {

        if (nums.length == 0)
            return 0;

        int k = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == val) {

                for (int j = i+1; j < nums.length; j++) {
                    if (nums[j] != val) {

                        nums[i] = nums[j];
                        nums[j] = val;
                        k++;
                        break;
                    }
                }

            } else {
                k++;
            }
        }

        return k;
    }
}
