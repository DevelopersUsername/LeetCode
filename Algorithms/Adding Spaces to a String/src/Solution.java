class Solution {
    public String addSpaces(String s, int[] spaces) {

        int index = 0, space = 0, n = spaces.length;
        StringBuilder ans = new StringBuilder(s.length() + n);

        for (char c : s.toCharArray()) {
            if (space < n && spaces[space] == index++) {
                ans.append(' ');
                space++;
            }
            ans.append(c);
        }

        return ans.toString();
    }
}