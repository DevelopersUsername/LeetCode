class Solution {
    public String makeFancyString(String s) {

        if (s.length() < 3) return s;

        StringBuilder ans = new StringBuilder();
        char[] chars = s.toCharArray();
        char prev = chars[0];
        ans.append(prev);
        int count = 1;

        for (int i = 1; i < chars.length; i++) {

            if (chars[i] == prev)
                count++;
            else {
                count = 1;
                prev = chars[i];
            }

            if (count < 3)
                ans.append(chars[i]);
        }

        return ans.toString();
    }
}