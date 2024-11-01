class NumArray {

    private final int[] nums;

    public NumArray(int[] nums) {

        this.nums = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++)
            this.nums[i] = this.nums[i - 1] + nums[i - 1];
    }

    public int sumRange(int left, int right) {
        return nums[right + 1] - nums[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */