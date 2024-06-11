class Solution {
    public int minimumChairs(String s) {

        int ans = 0, count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'E') count++;
            else count--;
            ans = Math.max(ans, count);
        }

        return ans;
    }
}