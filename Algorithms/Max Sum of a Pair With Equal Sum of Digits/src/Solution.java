import java.util.*;

class Solution {
    public int maximumSum(int[] nums) {

        int ans = -1;
        Map<Integer, int[]> map = new HashMap<>();

        for (int num : nums) {
            int sum = getSum(num);
            if (map.containsKey(sum)) {

                int[] list = map.get(sum);
                if (num > list[0] || num > list[1]) {
                    list[0] = Math.max(list[0], list[1]);
                    list[1] = num;
                }
            } else {
                int[] list = new int[2];
                list[0] = num;
                map.put(sum, list);
            }
        }

        for (Map.Entry<Integer, int[]> integerListEntry : map.entrySet()) {
            int[] list = integerListEntry.getValue();
            if (list[1] > 0)
                ans = Math.max(ans, list[0] + list[1]);
        }

        return ans;
    }

    public int getSum(int num) {

        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}