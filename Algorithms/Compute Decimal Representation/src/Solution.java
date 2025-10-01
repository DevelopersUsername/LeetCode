import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] decimalRepresentation(int n) {

        List<Integer> list = new ArrayList<>();
        int base = 1;
        while (n > 0) {

            int num = n % 10;
            if (num != 0) list.add(num * base);
            n /= 10;
            base *= 10;
        }

        int index = list.size() - 1;
        int[] ans = new int[index + 1];
        for (Integer num : list)
            ans[index--] = num;

        return ans;
    }
}