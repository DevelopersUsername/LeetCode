import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {

        Set<Integer> dist = new HashSet<>();
        int[][] points = {p1, p2, p3, p4};

        for (int i = 0; i < 4; i++)
            for (int j = i + 1; j < 4; j++)
                dist.add(getDist(points[i], points[j]));

        return dist.size() == 2 && !dist.contains(0);
    }

    private static int getDist(int[] p1, int[] p2) {
        int x = p1[0] - p2[0], y = p1[1] - p2[1];
        return x * x + y * y;
    }
}