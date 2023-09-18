import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> ans = new ArrayList<>();

        for (int i = left; i <= right; i++) {

            boolean selfDividing = true;
            int num = i;

            while (num > 0) {

                int t = num % 10;
                if (t == 0 || i % t != 0) {
                    selfDividing = false;
                    break;
                }

                num /= 10;
            }

            if (selfDividing) ans.add(i);
        }

        return ans;
    }
}