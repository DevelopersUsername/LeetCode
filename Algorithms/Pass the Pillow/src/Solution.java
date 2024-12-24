class Solution {
    public int passThePillow(int n, int time) {

        time %= (n - 1) * 2;

        if (n > time) return time + 1;
        else return n - (time - (n - 1));
    }
}