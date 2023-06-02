import java.util.*;

class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {

        int index = 0;
        int[][] ans = new int[score.length][];
        SortedSet<Integer> uniqueSet = new TreeSet<>(Collections.reverseOrder());

        for (int[] ints : score) {
            uniqueSet.add(ints[k]);
        }

        for (int elem : uniqueSet) {
            for (int[] ints : score) {
                if (ints[k] == elem) {
                    ans[index++] = ints;
                }
            }
        }

        return ans;
    }
}