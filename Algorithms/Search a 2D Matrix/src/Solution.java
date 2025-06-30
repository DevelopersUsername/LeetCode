class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        for (int[] row : matrix) {
            if (isValidRow(row, target)) {
                for (int elem : row)
                    if (elem == target)
                        return true;
                break;
            }
        }

        return false;
    }

    private static boolean isValidRow(int[] row, int target) {
        return target >= row[0] && target <= row[row.length - 1];
    }
}