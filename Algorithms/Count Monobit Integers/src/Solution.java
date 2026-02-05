class Solution {
    public int countMonobit(int n) {

        if (n == 0) return 1;

        int ans = 1, num = 1;
        while (num <= n) {
            num = num << 1 | 1;
            ans++;
        }

        return ans;
    }
}