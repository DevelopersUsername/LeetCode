class Solution {
    public int longestPalindrome(String s) {

        int ans = 0;
        int[] arr = new int[58];
        for (char c : s.toCharArray()) arr[c - 'A']++;
        for (int i : arr) ans += i - i % 2;

        if (s.length() != ans) ans++;

        return ans;
    }
}