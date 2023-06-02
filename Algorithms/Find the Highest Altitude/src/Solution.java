class Solution {
    public int largestAltitude(int[] gain) {

        int currentAltitude = 0, maxAltitude = Integer.MIN_VALUE;
        for (int point : gain) {
            currentAltitude += point;
            maxAltitude = Math.max(currentAltitude, maxAltitude);
        }

        return Math.max(0, maxAltitude);
    }
}