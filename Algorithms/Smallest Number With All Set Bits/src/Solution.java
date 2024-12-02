class Solution {
    public int smallestNumber(int n) {
        return Integer.parseInt("1".repeat(Integer.toBinaryString(n).length()), 2);
    }
}