class Solution {
    public int findChampion(int[][] grid) {

        int[] teams = new int[grid.length];

        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[i].length; j++)
                teams[i] += grid[i][j];

        int champion = 0, result = teams[0];
        for (int i = 1; i < teams.length; i++)
            if (teams[i] > result) {
                result = teams[i];
                champion = i;
            }


        return champion;
    }
}