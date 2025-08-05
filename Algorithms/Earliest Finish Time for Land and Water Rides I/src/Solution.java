class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

        int minLand = Integer.MAX_VALUE, landWater = minLand, minWater = minLand, waterLand = minLand;
        for (int i = 0; i < landStartTime.length; i++)
            minLand = Math.min(minLand, landStartTime[i] + landDuration[i]);

        for (int i = 0; i < waterStartTime.length; i++) {
            minWater = Math.min(minWater, waterStartTime[i] + waterDuration[i]);
            landWater = Math.min(landWater, Math.max(waterStartTime[i], minLand) + waterDuration[i]);
        }

        for (int i = 0; i < landStartTime.length; i++)
            waterLand = Math.min(waterLand, Math.max(landStartTime[i], minWater) + landDuration[i]);

        return Math.min(landWater, waterLand);
    }
}