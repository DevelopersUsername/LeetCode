class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {

        int ans = 0, countEn = 0, n = energy.length;

        for (int i = 0; i < n; i++) {

            countEn += energy[i];
            if (initialExperience <= experience[i]) {
                ans += experience[i] - initialExperience + 1;
                initialExperience = experience[i] + 1;
            }

            initialExperience += experience[i];
        }

        if (countEn >= initialEnergy)
            ans += countEn - initialEnergy + 1;

        return ans;
    }
}