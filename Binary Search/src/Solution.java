class Solution {
    public int search(int[] nums, int target) {

//        - Time complexity: O(log n)
//        - Space complexity: O(1)

        int start = 0, med = nums.length / 2, end = nums.length - 1;
        while (start <= end) {

            if (nums[med] == target) {
                return med;
            } else if (nums[med] > target) {
                end = med - 1;
            } else if (nums[med] < target) {
                start = med + 1;
            }
            med = (start + end) / 2;
        }

        return -1;
    }
}