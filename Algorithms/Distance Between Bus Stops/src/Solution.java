class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        if (start > destination) {
            int t = start;
            start = destination;
            destination = t;
        }

        int sum = 0, dist = 0;
        for (int i = 0; i < distance.length; i++) {
            if (i >= start && i < destination) dist += distance[i];
            sum += distance[i];
        }

        return Math.min(dist, sum - dist);
    }
}