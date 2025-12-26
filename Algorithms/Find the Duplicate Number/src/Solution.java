class Solution {
    public int findDuplicate(int[] nums) {

        int max = Integer.MIN_VALUE;
        for (int num : nums) max = Math.max(max, num);

        boolean[] check = new boolean[max + 1];
        for (int num : nums)
            if (check[num]) return num;
            else check[num] = true;

        return -1;
    }
}