import java.util.Arrays;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() < 2) return s.length();

        int ans = 1, j = -1;
        char[] arr = s.toCharArray();
        int[] lastVisit = new int[128];
        Arrays.fill(lastVisit, -1);

        for (int i = 0; i < arr.length; i++) {
            j = Math.max(j, lastVisit[arr[i]]);
            lastVisit[arr[i]] = i;
            ans = Math.max(ans, i - j);
        }

        return ans;
    }
}