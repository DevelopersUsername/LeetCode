class Solution {
    public String getSmallestString(String s) {

        StringBuilder ans = new StringBuilder(s.length());

        char[] chars = s.toCharArray();
        boolean found = false;
        int n = chars.length;
        for (int i = 1; i < n; i++) {

            if (!found && chars[i] != chars[i - 1]
                    && (chars[i] - '0') % 2 == (chars[i - 1] - '0') % 2
                    && chars[i] - '0' < chars[i - 1] - '0') {

                found = true;
                ans.append(chars[i]).append(chars[i++ - 1]);
            } else ans.append(chars[i - 1]);

            if (i == n - 1) ans.append(chars[i]);
        }

        return ans.toString();
    }
}