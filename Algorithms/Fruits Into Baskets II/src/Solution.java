class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {

        int ans = 0;
        boolean[] visited = new boolean[fruits.length];
        for (int fruit : fruits) {

            boolean find = false;
            for (int j = 0; j < baskets.length; j++) {

                if (visited[j]) continue;
                if (fruit <= baskets[j]) {
                    find = true;
                    visited[j] = true;
                    break;
                }
            }
            if (!find) ans++;
        }

        return ans;
    }
}