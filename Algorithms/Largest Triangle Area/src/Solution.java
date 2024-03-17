class Solution {
    public double largestTriangleArea(int[][] points) {

        double ans = 0.0;

        for (int i = 0; i < points.length; i++)
            for (int j = i + 1; j < points.length; j++)
                for (int k = j + 1; k < points.length; k++)
                    ans = Math.max(ans, area(points[i], points[j], points[k]));

        return ans;
    }

    private double area(int[] i, int[] j, int[] k) {
        return Math.abs(i[0] * j[1] + j[0] * k[1] + k[0] * i[1] - j[0] * i[1] - k[0] * j[1] - i[0] * k[1]) * 0.5;
    }
}