class Solution {
    public int removePalindromeSub(String s) {
        return s.contentEquals(new StringBuilder(s).reverse()) ? 1 : 2;
    }
}