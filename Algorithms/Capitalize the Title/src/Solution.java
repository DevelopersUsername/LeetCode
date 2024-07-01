class Solution {
    public String capitalizeTitle(String title) {

        StringBuilder sb = new StringBuilder(title.length());
        for (String s : title.split(" ")) {
            if (s.length() < 3) sb.append(s.toLowerCase());
            else sb.append(s.substring(0, 1).toUpperCase()).append(s.substring(1).toLowerCase());
            sb.append(" ");
        }

        return sb.substring(0, sb.length() - 1);
    }
}