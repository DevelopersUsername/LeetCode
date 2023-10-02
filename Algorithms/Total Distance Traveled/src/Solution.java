class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {

        int ans = 0, usedUp = 0;
        while (mainTank > 0) {

            ans += 10;
            if (++usedUp == 5 && additionalTank > 0) {
                usedUp = 0;
                additionalTank--;
            } else mainTank--;
        }

        return ans;
    }
}