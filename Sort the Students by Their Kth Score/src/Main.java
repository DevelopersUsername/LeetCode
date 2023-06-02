public class Main {
    public static void main(String[] args) {

        int[][] score = {
                {10,6,9,1},
                {7,5,11,2},
                {3,2,11,8},
                {4,8,3,15}};

        System.out.println(new Solution().sortTheStudents(score, 0));
    }
}