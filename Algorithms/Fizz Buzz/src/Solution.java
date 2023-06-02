import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {

        // Time Complexities O(n)
        // Space Complexities O(1)
        List<String> result = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {

            Boolean divisibleBy3 = i % 3 == 0;
            Boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5)
                result.add("FizzBuzz");
            else if (divisibleBy3) {
                result.add("Fizz");
            } else if (divisibleBy5) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }

        return result;
    }
}