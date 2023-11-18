class Solution {
    public int[] searchRange(int[] nums, int target) {

        if (nums.length == 0) return new int[]{-1, -1};

        int l = search(nums, target);
        int r = search(nums, target + 1);

        return l == r ? new int[]{-1, -1} : new int[]{l, r - 1};
    }

    private int search(int[] nums, int target) {

        int l = 0, r = nums.length, m;
        while (l < r) {

            m = (l + r) / 2;
            if (nums[m] >= target) r = m;
            else l = m + 1;
        }

        return l;
    }
}