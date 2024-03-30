class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int[] ans = new int[2];
        int max = 0;

        for (int i = 0; i < mat.length; i++) {

            int count = 0;
            for (int elem : mat[i]) count+=elem;
            if (count > max) {
                ans[0] = i;
                ans[1] = count;
                max = count;
            }
        }

        return ans;
    }
}