class Solution {
    public char findTheDifference(String s, String t) {

        char ans = t.charAt(t.length() -1);
        for (int i = 0; i < s.length(); i++) {
            ans += t.charAt(i);
            ans -= s.charAt(i);
        }

        return ans;
    }
}