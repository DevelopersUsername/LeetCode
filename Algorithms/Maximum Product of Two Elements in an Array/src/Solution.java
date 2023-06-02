class Solution {
    public int maxProduct(int[] nums) {

        int maxOne = Integer.MIN_VALUE, maxTwo = Integer.MAX_VALUE;

        for(int num : nums){
            if (maxOne < num){
                maxTwo = maxOne;
                maxOne = num;
            } else if (maxTwo < num){
                maxTwo = num;
            }
        }

        return --maxOne * --maxTwo;
    }
}