class Solution {
    public int scoreOfString(String s) {

        int ans = 0;
        char prev = s.charAt(0), cur;
        for (int i = 1; i < s.length(); i++){
            cur = s.charAt(i);
            ans += Math.abs(prev - cur);
            prev = cur;
        }

        return ans;
    }
}