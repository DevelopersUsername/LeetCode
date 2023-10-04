import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();
        if (numRows == 0) return ans;

        List<Integer> prevRow = new ArrayList<>(Collections.singletonList(1));
        ans.add(prevRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(List.of(1));
            for (int j = 1; j < i; j++) row.add(prevRow.get(j) + prevRow.get(j - 1));
            row.add(1);
            prevRow = row;
            ans.add(row);
        }

        return ans;
    }
}