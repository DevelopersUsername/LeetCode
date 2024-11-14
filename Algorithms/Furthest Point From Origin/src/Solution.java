class Solution {
    public int furthestDistanceFromOrigin(String moves) {

        int moveL = 0, movetR = 0;
        for (char move : moves.toCharArray()) {
            if (move == 'L' || move == '_') moveL++;
            else moveL--;

            if (move == 'R' || move == '_') movetR++;
            else movetR--;
        }

        return Math.max(moveL, movetR);
    }
}