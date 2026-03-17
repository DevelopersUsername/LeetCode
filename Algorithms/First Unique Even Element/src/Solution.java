class Solution {
    public int firstUniqueEven(int[] nums) {

        int[] count = new int[101];
        for (int num : nums) count[num]++;
        for (int num : nums) if (count[num] == 1 && num % 2 == 0) return num;

        return -1;
    }
}