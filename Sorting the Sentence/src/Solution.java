class Solution {
    public String sortSentence(String s) {

        String[] result = new String[s.split(" ").length];
        for(String str: s.split(" ")) {
            result[str.charAt(str.length() - 1) - '1'] = str.substring(0, str.length() - 1);
        }

        return String.join(" ", result);
    }
}