class Solution {
    public String gcdOfStrings(String str1, String str2) {

        String bigger, smaller;
        if (str1.length() > str2.length()) {
            bigger = str1;
            smaller = str2;
        } else {
            bigger = str2;
            smaller = str1;
        }

        if (bigger.equals(smaller)) return bigger;
        else if (!bigger.startsWith(smaller)) return "";
        else return gcdOfStrings(bigger.substring(smaller.length()), smaller);
    }
}