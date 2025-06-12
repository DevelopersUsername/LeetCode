class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length - 1, index;

        for (index = n - 1; index >= 0; index--)
            if (nums[index] < nums[index + 1])
                break;

        if (index >= 0)
            for (int j = n; j > index; j--)
                if (nums[j] > nums[index]) {
                    swap(nums, index, j);
                    break;
                }

        reverse(nums, index + 1, n);
    }

    private static void reverse(int[] nums, int l, int r) {
        while (l < r)
            swap(nums, l++, r--);
    }

    private static void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}