class Solution {
    public int[] diStringMatch(String s) {

        int[] ans = new int[s.length() + 1];
        int i = 0, k = 0, d = s.length();

        for (char c : s.toCharArray())
            if (c == 'I') ans[k++] = i++;
            else ans[k++] = d--;

        ans[k] = d;

        return ans;
    }
}