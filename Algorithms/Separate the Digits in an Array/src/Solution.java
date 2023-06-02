import java.util.stream.IntStream;

class Solution {
    public int[] separateDigits(int[] nums) {
        return IntStream.of(nums)
                .flatMap(num -> String.valueOf(num).chars())
                .map(c -> c - '0').toArray();
    }
}