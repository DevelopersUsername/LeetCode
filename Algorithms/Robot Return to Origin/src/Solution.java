class Solution {
    public boolean judgeCircle(String moves) {

        if (moves.isEmpty()) return true;

        int h = 0, v = 0;
        for (char move : moves.toCharArray())
            if (move == 'U' || move == 'D') v += move == 'U' ? 1 : -1;
            else h += move == 'L' ? 1 : -1;

        return h == 0 && v == 0;
    }
}