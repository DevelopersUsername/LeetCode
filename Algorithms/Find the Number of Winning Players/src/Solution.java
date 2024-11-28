class Solution {
    public int winningPlayerCount(int n, int[][] pick) {

        int ans = 0;
        int[][] players = new int[n][];
        for (int i = 0; i < players.length; i++)
            players[i] = new int[11];

        for (int[] p : pick)
            players[p[0]][p[1]]++;

        for (int i = 0; i < players.length; i++)
            for (int color : players[i])
                if (color > i) {
                    ans++;
                    break;
                }

        return ans;
    }
}