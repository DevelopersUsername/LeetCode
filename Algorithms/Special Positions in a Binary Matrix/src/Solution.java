class Solution {

    public int numSpecial(int[][] mat) {

        int ans = 0;
        int[] rowCount = new int[mat.length], colCount = new int[mat[0].length];

        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++)
                if (mat[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                }

        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++)
                if (mat[i][j] == 1
                        && rowCount[i] == 1
                        && colCount[j] == 1)
                    ans++;

        return ans;
    }
}