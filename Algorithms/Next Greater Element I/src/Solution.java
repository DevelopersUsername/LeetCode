import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> nums = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num)
                nums.put(stack.pop(), num);
            stack.push(num);
        }

        for (int i = 0; i < nums1.length; i++)
            nums1[i] = nums.getOrDefault(nums1[i], -1);

        return nums1;
    }
}