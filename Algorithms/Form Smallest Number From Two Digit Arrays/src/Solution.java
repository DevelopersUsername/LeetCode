class Solution {
    public int minNumber(int[] nums1, int[] nums2) {

        int num1 = 10, num2 = 10;
        int[] count = new int[10];

        for (int i : nums1) {
            count[i]++;
            num1 = Math.min(num1, i);
        }

        for (int i : nums2) {
            count[i]++;
            num2 = Math.min(num2, i);
        }

        for (int i = 0; i < count.length; i++)
            if (count[i] == 2) return i;

        return Math.min(num1, num2) * 10 + Math.max(num1, num2);
    }
}