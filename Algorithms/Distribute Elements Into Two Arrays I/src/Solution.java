import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] resultArray(int[] nums) {

        List<Integer> arr1 = new ArrayList<>(), arr2 = new ArrayList<>();

        int last1 = nums[0], last2 = nums[1];
        arr1.add(last1);
        arr2.add(last2);

        for (int i = 2; i < nums.length; i++)
            if (last1 > last2) {
                last1 = nums[i];
                arr1.add(last1);
            } else {
                last2 = nums[i];
                arr2.add(last2);
            }

        int i = 0;
        for (Integer integer : arr1) nums[i++] = integer;
        for (Integer integer : arr2) nums[i++] = integer;

        return nums;
    }
}