import java.util.List;

class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {

        int i = 0, j = 0;
        for (String command : commands)
            switch (command) {
                case "UP":
                    j--;
                    break;
                case "DOWN":
                    j++;
                    break;
                case "LEFT":
                    i--;
                    break;
                case "RIGHT":
                    i++;
                    break;
            }

        return i + j * n;
    }
}