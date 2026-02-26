import java.util.Random;

class Solution {

    private int[] nums;
    private int bound;
    private static Random rand = new Random();

    public Solution(int[] nums) {
        this.nums = nums;
        this.bound = nums.length;
    }

    public int pick(int target) {
        while(true){
            int range = rand.nextInt(bound);
            if(nums[range] == target)
                return range;
        }
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */