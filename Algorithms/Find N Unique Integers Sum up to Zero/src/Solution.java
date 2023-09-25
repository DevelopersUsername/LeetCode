class Solution {
    public int[] sumZero(int n) {

        int[] ans = new int[n];

        int index = 0;
        if (n % 2 == 1) ans[index++] = 0;

        for (int i = index; i < n; i += 2) {
            ans[i] = i + 1;
            ans[i + 1] = -ans[i];
        }

        return ans;
    }
}