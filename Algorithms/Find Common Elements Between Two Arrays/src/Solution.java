class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        return new int[]{findIntersection(nums1, nums2), findIntersection(nums2, nums1)};
    }

    private Integer findIntersection(int[] nums1, int[] nums2) {

        int[] t = new int[101];
        for (int num : nums2) t[num]++;

        int count = 0;
        for (int num : nums1) if (t[num] > 0) count++;

        return count;
    }
}