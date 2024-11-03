class Solution {
    public int[] distributeCandies(int candies, int num_people) {

        int[] ans = new int[num_people];
        int i = 0;

        while (candies > 0) {
            int count = i + 1;
            if (count > candies)
                count = candies;
            ans[i++ % num_people] += count;
            candies -= count;
        }

        return ans;
    }
}