class Solution {
    public String getHint(String secret, String guess) {

        int[] nums = new int[10];
        int countA = 0, countB = 0;
        for (int i = 0; i < secret.length(); i++)
            if(secret.charAt(i) == guess.charAt(i)) countA++;
            else{
                if (nums[guess.charAt(i) - '0']-- > 0) countB++;
                if(nums[secret.charAt(i) - '0']++ < 0) countB++;
            }

        return new StringBuilder().append(countA).append("A").append(countB).append("B").toString();
    }
}