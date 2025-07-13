import java.util.Arrays;

class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {

        int ans = 0, n = players.length;
        Arrays.sort(players);
        Arrays.sort(trainers);

        for (int trainer : trainers)
            if (players[ans] <= trainer && ++ans == n)
                return ans;

        return ans;
    }
}