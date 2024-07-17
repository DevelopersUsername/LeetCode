import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] findEvenNumbers(int[] digits) {

        int[] count = new int[10];
        for (int digit : digits)
            count[digit]++;

        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= 9; i++)
            for (int j = 0; j <= 9; j++)
                for (int k = 0; k <= 8; k += 2)
                    if (isGood(count, i, j, k))
                        ans.add(i * 100 + j * 10 + k);

        return ans.stream().mapToInt(i -> i).toArray();
    }

    private static boolean isGood(int[] count, int i, int j, int k) {
        return count[i] > 0 && count[j] > (j == i ? 1 : 0)
                && count[k] > (k == i ? 1 : 0) + (k == j ? 1 : 0);
    }
}