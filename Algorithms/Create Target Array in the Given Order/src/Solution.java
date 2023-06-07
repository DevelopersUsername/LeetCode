import java.util.ArrayList;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            list.add(index[i], nums[i]);
        }

        int id = 0;
        int[] ans = new int[nums.length];
        for (int elem : list) {
            ans[id++] = elem;
        }

        return ans;
    }
}