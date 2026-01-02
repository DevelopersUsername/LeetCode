import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public long dividePlayers(int[] skill) {

        long ans = 0;
        int n = skill.length, teamSkill = Arrays.stream(skill).sum() / (n / 2);
        Map<Integer, Integer> count = new HashMap<>();

        for (int s : skill)
            count.merge(s, 1, Integer::sum);

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int s = entry.getKey();
            int freq = entry.getValue();
            int requiredSkill = teamSkill - s;
            if (count.getOrDefault(requiredSkill, 0) != freq)
                return -1;
            ans += (long) s * requiredSkill * freq;
        }

        return ans / 2;
    }
}