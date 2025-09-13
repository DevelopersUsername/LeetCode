class Solution {
    public int smallestAbsent(int[] nums) {

        int avg, sum = 0;
        int[] pos = new int[101];

        for (int num : nums) {
            if (num > 0) pos[num]++;
            sum += num;
        }

        avg = (sum / nums.length) + 1;
        for (int i = Math.max(avg, 1); i < pos.length; i++) if (pos[i] == 0) return i;

        return 101;
    }
}