class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {

        int sum = 0;
        for (int i = 0; i < nums1.length; i++)
            sum += -nums1[i] + nums2[i];

        return sum / nums1.length;
    }
}