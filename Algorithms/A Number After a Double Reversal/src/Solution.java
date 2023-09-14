class Solution {
    public boolean isSameAfterReversals(int num) {

        String s = String.valueOf(num);

        return s.length() == 1 || s.charAt(s.length() - 1) != '0';
    }
}