import java.util.List;
import java.util.Stack;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        if (rooms.size() <= 1) return true;

        int count = 1;
        boolean[] visitedRooms = new boolean[rooms.size()];
        visitedRooms[0] = true;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        while (!stack.isEmpty())

            for (int key : rooms.get(stack.pop()))

                if (!visitedRooms[key]) {
                    stack.push(key);
                    visitedRooms[key] = true;
                    count++;
                }

        return rooms.size() == count;
    }
}