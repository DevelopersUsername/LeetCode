class Solution {
    public int countBinarySubstrings(String s) {

        if (s.length() < 2) return 0;

        int ans = 0, prev = 0, curr = 1;
        char[] arr = s.toCharArray();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) curr++;
            else {
                ans += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
        }

        return ans + Math.min(prev, curr);
    }
}