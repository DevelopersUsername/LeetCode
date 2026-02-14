class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int min = Integer.MAX_VALUE, oddNeg = 0;

        for (int[] row : matrix)
            for (int col : row) {
                sum += Math.abs(col);
                min = Math.min(min, Math.abs(col));
                if (col < 0) oddNeg ^= 1;
            }

        return sum - oddNeg * min * 2;
    }
}