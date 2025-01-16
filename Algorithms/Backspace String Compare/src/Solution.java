class Solution {
    public boolean backspaceCompare(String s, String t) {
        return getBackspace(s).equals(getBackspace(t));
    }

    private String getBackspace(String s) {

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray())
            if (c != '#') sb.append(c);
            else if (!sb.isEmpty()) sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}