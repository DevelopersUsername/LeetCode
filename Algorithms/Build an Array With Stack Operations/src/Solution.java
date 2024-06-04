import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> buildArray(int[] target, int n) {

        List<String> ans = new ArrayList<>();
        int start = 0, num = 1;

        while (start < target.length) {

            ans.add("Push");
            if (target[start] == num++) start++;
            else ans.add("Pop");
        }

        return ans;
    }
}