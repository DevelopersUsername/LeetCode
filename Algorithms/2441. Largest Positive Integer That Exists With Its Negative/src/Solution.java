class Solution {
    public int findMaxK(int[] nums) {

        int[] plus = new int[1001], minus = new int[1001];

        for (int num : nums)
            if (num > 0) plus[num]++;
            else minus[-num]--;

        for (int i = plus.length - 1; i >= 0; i--)
            if (plus[i] > 0 && minus[i] < 0) return i;

        return -1;
    }
}