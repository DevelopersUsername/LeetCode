import java.util.Arrays;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        int ans = 0;

        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        for (int[] boxType : boxTypes) {

            if (boxType[0] >= truckSize) return ans + boxType[1] * truckSize;
            ans += boxType[0] * boxType[1];
            truckSize -= boxType[0];
        }

        return ans;
    }
}