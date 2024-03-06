import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int diff = 0;
        Set<Integer> set = new HashSet<>();
        for (int aliceSize : aliceSizes) diff += aliceSize;
        for (int bobSize : bobSizes) {
            diff -= bobSize;
            set.add(bobSize);
        }

        diff /= 2;
        for (int aliceSize : aliceSizes) {
            int swap = aliceSize - diff;
            if (set.contains(swap))
                return new int[]{aliceSize, swap};
        }

        return new int[2];
    }
}