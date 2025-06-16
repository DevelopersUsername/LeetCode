class Solution {
    public String generateTag(String caption) {

        StringBuilder ans = new StringBuilder(100).append('#');

        char[] chars = caption.toCharArray();
        int n = chars.length, index = 0;

        while (index < n && !Character.isLetter(chars[index])) index++;
        if (index == n) return "#";

        ans.append(Character.toLowerCase(chars[index]));

        char prev = chars[index++];
        while (ans.length() < 100 && index < n) {
            if (!Character.isLetter(chars[index]) && chars[index] != ' ') {
                index++;
                continue;
            }
            if (prev == ' ' && Character.isLetter(chars[index])) ans.append(Character.toUpperCase(chars[index]));
            else if (Character.isLetter(chars[index])) ans.append(Character.toLowerCase(chars[index]));
            prev = chars[index++];
        }

        return ans.toString();
    }
}