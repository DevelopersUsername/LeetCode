import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {

        Integer[] ans = new Integer[rowIndex + 1];
        Arrays.fill(ans, 1);

        for (int i = 2; i <= rowIndex; i++)
            for (int j = 1; j < i; j++)
                ans[i - j] += ans[i - j - 1];

        return Arrays.asList(ans);
    }
}