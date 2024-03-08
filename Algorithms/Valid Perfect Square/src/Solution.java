class Solution {
    public boolean isPerfectSquare(int num) {

        double t, sr = (double) num / 2;

        do {
            t = sr;
            sr = (t + (num / t)) / 2;
        } while ((t - sr) != 0);

        return (int) sr * sr == num;
    }
}