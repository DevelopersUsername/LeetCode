class Solution {
    public int minMoves(int[] nums) {

        int max =  Integer.MIN_VALUE, sum = 0, count = 0;
        for (int num : nums) max = Math.max(max, num);

        for (int num : nums)
            if (num != max) {
                count++;
                sum += num;
            }

        return  count * max - sum;
    }
}