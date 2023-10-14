class Solution {
    public int[] processQueries(int[] queries, int m) {

        int[] ans = new int[queries.length], permutation = new int[m + 1];

        for (int i = 0; i < permutation.length; i++) permutation[i] = i + 1;

        for (int i = 0; i < queries.length; i++) {

            boolean flag = false;
            for (int j = Math.min(queries[i] + i, permutation.length - 1); j >= 0; j--) {
                if (permutation[j] == queries[i]) {
                    ans[i] = j;
                    flag = true;

                    for (int k = j; k > 0; k--)
                        permutation[k] = permutation[k - 1];
                }

                if (flag) break;
            }

            permutation[0] = queries[i];
        }

        return ans;
    }
}