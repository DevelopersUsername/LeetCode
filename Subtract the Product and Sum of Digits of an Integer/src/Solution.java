class Solution {
    public int subtractProductAndSum(int n) {

        int sum = 0;
        int product = 1;

        for (char c : String.valueOf(n).toCharArray()) {
            sum += c - '0';
            product *= c - '0';
        }

        return product - sum;
    }
}