public class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int k = 1;
        int prevIndex = 1;
        int elem = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > elem) {

                elem = nums[i];
                nums[prevIndex] = elem;
                prevIndex++;
                k++;
            }
        }

        return k;
    }
}
