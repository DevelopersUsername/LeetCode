import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new LinkedList<>();
        int count = matrix.length * matrix[0].length, up = 0, left = 0, right = matrix[0].length - 1, down = matrix.length - 1;

        while (count > 0) {

            for (int i = left; i <= right && count > 0; i++, --count) ans.add(matrix[up][i]);
            for (int i = ++up; i <= down - 1 && count > 0; i++, --count) ans.add(matrix[i][right]);
            for (int i = right--; i >= left && count > 0; i--, --count) ans.add(matrix[down][i]);
            for (int i = --down; i >= up && count > 0; i--, --count) ans.add(matrix[i][left]);

            left++;
        }

        return ans;
    }
}