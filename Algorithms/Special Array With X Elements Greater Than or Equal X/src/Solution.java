class Solution {
    public int specialArray(int[] nums) {

        int[] t = new int[1001];
        for (int num : nums) t[num]++;

        int count = 0;
        for (int i = t.length - 1; i > 0; i--) {
            if (t[i] > 0) count += t[i];
            if (count == i) return i;
        }

        return -1;
    }
}