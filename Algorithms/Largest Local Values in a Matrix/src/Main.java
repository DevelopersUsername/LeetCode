public class Main {
    public static void main(String[] args) {

        int[][] grid = new int[][] {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,2,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1}
        };

        System.out.println(new Solution().largestLocal(grid));
    }
}