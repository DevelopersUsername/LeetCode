class Solution {
    public String reversePrefix(String s, int k) {

        if (k <= 1)  return s;
        else return new StringBuilder(s.substring(0, k)).reverse().append(s.substring(k)).toString();
    }
}