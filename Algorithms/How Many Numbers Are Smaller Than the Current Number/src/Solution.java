import java.util.Arrays;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int s;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            s = 0;
            for (int j = 0; j < nums.length; j++) {

                if (i != j && nums[i] > nums[j]) {
                    s++;
                }
            }

            result[i] = s;
        }

        return result;
    }
}