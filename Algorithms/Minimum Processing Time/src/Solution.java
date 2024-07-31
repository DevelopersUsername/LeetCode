import java.util.List;

class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {

        int ans = 0;
        processorTime.sort(Integer::compareTo);
        tasks.sort(Integer::compareTo);

        for (int i = 0, j = tasks.size() - 1; i < processorTime.size(); i++, j -= 4)
            ans = Math.max(ans, processorTime.get(i) + tasks.get(j));

        return ans;
    }
}