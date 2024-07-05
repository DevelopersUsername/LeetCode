class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {

        if (numOnes + numZeros >= k)
            return Math.min(numOnes, k);
        else return numOnes - (k - numOnes - numZeros);
    }
}