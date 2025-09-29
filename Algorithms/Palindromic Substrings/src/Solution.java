class Solution {
    public int countSubstrings(String s) {

        int ans = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            ans += palindromic(arr, i, i);
            ans += palindromic(arr, i, i + 1);
        }

        return ans;
    }

    private static int palindromic(char[] arr, int l, int r) {

        int count = 0;
        while (l >= 0 && r < arr.length && arr[l] == arr[r]) {
            count++;
            l--;
            r++;
        }

        return count;
    }
}