class Solution {
    public int findJudge(int n, int[][] trust) {

        if (n == 1) return 1;

        int[] people = new int[n + 1];
        for (int[] person : trust) {
            people[person[1]]++;
            people[person[0]]--;
        }

        for (int i = 1; i <= n; i++)
            if (people[i] == n - 1) return i;

        return -1;
    }
}