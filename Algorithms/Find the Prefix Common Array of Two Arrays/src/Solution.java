class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int prefixCommon = 0, n = A.length;
        int[] ans = new int[n], count = new int[n + 1];

        for (int i = 0; i < n; ++i) {
            if (++count[A[i]] == 2) prefixCommon++;
            if (++count[B[i]] == 2) prefixCommon++;
            ans[i] = prefixCommon;
        }

        return ans;
    }
}