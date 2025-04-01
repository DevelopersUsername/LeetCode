class Solution {
    public int hardestWorker(int n, int[][] logs) {

        int max = Integer.MIN_VALUE, prev = 0;
        int[] employees = new int[n];

        for (int[] log : logs) {
            employees[log[0]] = Math.max(employees[log[0]], log[1] - prev);
            max = Math.max(max, employees[log[0]]);
            prev = log[1];
        }

        for (int i = 0; i < employees.length; i++)
            if (employees[i] == max)
                return i;

        return -1;
    }
}