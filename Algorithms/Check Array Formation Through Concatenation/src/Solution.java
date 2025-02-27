import java.util.*;

class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {

        Map<Integer, int[]> map = new HashMap<>();

        for (int[] piece : pieces)
            map.put(piece[0], piece);

        for (int i = 0; i < arr.length;) {
            if (!map.containsKey(arr[i])) return false;
            for (int num : map.get(arr[i]))
                if (arr[i++] != num) return false;
        }

        return true;
    }
}