import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> cellsInRange(String s) {

        List<String> list = new ArrayList<>();
        char startRow = s.charAt(1), endRow = s.charAt(4);

        for (char c = s.charAt(0); c <= s.charAt(3); c++) {
            for (char r = startRow; r <= endRow; r++) {
                list.add(new String(new char[] {c, r}));
            }
        }

        return list;
    }
}