import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids)

            if (asteroid > 0) stack.push(asteroid);
            else {

                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid))
                    stack.pop();

                if (stack.isEmpty() || stack.peek() < 0) stack.push(asteroid);
                else if (stack.peek() == Math.abs(asteroid)) stack.pop();
            }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}