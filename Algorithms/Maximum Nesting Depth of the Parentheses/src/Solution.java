class Solution {
    public int maxDepth(String s) {

        int ans = 0, brackets = 0;

        for (char c : s.toCharArray())
            if (c == '(') ans = Math.max(ans, ++brackets);
            else if (c == ')') brackets--;

        return ans;
    }
}