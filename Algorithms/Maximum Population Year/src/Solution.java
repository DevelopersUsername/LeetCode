class Solution {
    public int maximumPopulation(int[][] logs) {

        int ans = 0, max = 0, lenght = 0;

        int[] population = new int[2051];
        for (int[] log : logs) {
            population[log[0]]++;
            population[log[1]]--;
        }

        for (int year = 1950; year <= 2050; ++year) {
            lenght += population[year];
            if (lenght > max) {
                max = lenght;
                ans = year;
            }
        }

        return ans;
    }
}