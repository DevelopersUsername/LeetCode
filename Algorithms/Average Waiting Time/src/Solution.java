class Solution {
    public double averageWaitingTime(int[][] customers) {

        double sum = 0, finish = 0;
        for (int[] customer : customers) {
            finish = Math.max(finish, customer[0]) + customer[1];
            sum += finish - customer[0];
        }

        return sum / customers.length;
    }
}