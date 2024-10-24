class Solution {
    public int wateringPlants(int[] plants, int capacity) {

        int ans = 0, balance = capacity;
        for (int i = 0; i < plants.length; i++) {

            if (balance < plants[i]) {
                ans += 2 * i + 1;
                balance = capacity;
            }
            else ans++;

            balance -= plants[i];
        }

        return ans;
    }
}