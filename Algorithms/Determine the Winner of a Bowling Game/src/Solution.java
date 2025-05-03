class Solution {
    public int isWinner(int[] player1, int[] player2) {

        int sum1 = 0, sum2 = 0, power1 = 0, power2 = 0, n = player1.length;

        for (int i = 0; i < n; i++) {

            if (power1 > 0) {
                sum1 += player1[i] * 2;
                power1--;
            } else sum1 += player1[i];

            if (power2 > 0) {
                sum2 += player2[i] * 2;
                power2--;
            } else sum2 += player2[i];

            if (player1[i] == 10) power1 = 2;
            if (player2[i] == 10) power2 = 2;
        }

        if (sum1 > sum2) return 1;
        else if (sum1 < sum2) return 2;
        else return 0;
    }
}