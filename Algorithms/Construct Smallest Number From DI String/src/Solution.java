class Solution {
    public String smallestNumber(String pattern) {

        int n = pattern.length();
        StringBuilder ans = new StringBuilder(n), temp = new StringBuilder(n);
        for (int i = 0; i <= n; i++) {
            temp.append((char)('1' + i));
            if (i == n || pattern.charAt(i) == 'I') {
                ans.append(temp.reverse());
                temp = new StringBuilder();
            }
        }

        return ans.toString();
    }
}