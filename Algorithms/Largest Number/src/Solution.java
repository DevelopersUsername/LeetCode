import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String largestNumber(int[] nums) {

        List<String> list = new ArrayList<>(nums.length);
        for (int num : nums) list.add(String.valueOf(num));

        Collections.sort(list, (a, b) -> (b + a).compareTo(a + b));

        if (list.get(0).equals("0")) return "0";

        StringBuilder ans = new StringBuilder();
        for (String s : list) ans.append(s);

        return ans.toString();
    }
}