import java.util.List;

class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {

        int ans = 0;
        int[] t = new int[101];
        for (List<Integer> num : nums)
            for (int i = num.get(0); i <= num.get(1); i++)
                t[i]++;

        for (int i : t)
            if (i > 0) ans++;

        return ans;
    }
}