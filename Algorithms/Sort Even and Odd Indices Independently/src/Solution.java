class Solution {
    public int[] sortEvenOdd(int[] nums) {

        int[] odd = new int[101], even = new int[101];
        for (int i = 0; i < nums.length; i++)
            if (i % 2 == 0) even[nums[i]]++;
            else odd[nums[i]]++;

        int j = 1;
        for (int i = odd.length - 1; i >= 0; i--)
            while (odd[i]-- > 0) {
                nums[j] = i;
                j += 2;
            }

        j = 0;
        for (int i = 0; i < even.length; i++)
            while (even[i]-- > 0) {
                nums[j] = i;
                j += 2;
            }

        return nums;
    }
}