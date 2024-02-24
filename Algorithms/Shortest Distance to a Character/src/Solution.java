class Solution {
    public int[] shortestToChar(String s, char c) {

        int n = s.length(), prev = -n;
        int[] ans = new int[n];
        char[] arr = s.toCharArray();

        for (int i = 0; i < n; i++) {
            if (arr[i] == c) prev = i;
            ans[i] = i - prev;
        }

        for (int i = prev - 1; i >= 0; i--) {
            if (arr[i] == c) prev = i;
            ans[i] = Math.min(ans[i], prev - i);
        }

        return ans;
    }
}