import java.util.HashMap;
import java.util.Map;

class Solution {
    public int mostFrequentEven(int[] nums) {

        Map<Integer, Integer> count = new HashMap<>();

        int ans = Integer.MAX_VALUE, maxFreq = 0;
        for (int num : nums)
            if (num % 2 == 0) {

                int freq = count.getOrDefault(num, 0) + 1;
                count.put(num, freq);

                if (freq > maxFreq || freq == maxFreq && num < ans) {
                    maxFreq = freq;
                    ans = num;
                }
            }

        return maxFreq == 0 ? -1 : ans;
    }
}