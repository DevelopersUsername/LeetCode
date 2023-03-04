class Solution {
    public int strStr(String haystack, String needle) {

//      - Time complexity: O(m*n)
//      - Space complexity: O(1)

        if (haystack.length() < needle.length())
            return -1;

        int idx = 0;
        for (int i = 0; i < haystack.length(); i++){

            if (haystack.charAt(i) == needle.charAt(idx)) {
                idx++;
            } else {
                i = i - idx;
                idx = 0;
            }

            if (idx == needle.length()) {
                return ++i - needle.length();
            }
        }

        return -1;
    }
}