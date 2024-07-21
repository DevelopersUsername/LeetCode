class Solution {

    public int maxNumberOfBalloons(String text) {

        int ans = Integer.MAX_VALUE;
        int[] chars = new int[5];

        for (char c : text.toCharArray())
            switch(c) {
                case 'b' -> chars[0]++;
                case 'a' -> chars[1]++;
                case 'l' -> chars[2]++;
                case 'o' -> chars[3]++;
                case 'n' -> chars[4]++;
            }

        chars[2] /= 2;
        chars[3] /= 2;
        for (int c : chars)
            ans = Math.min(ans, c);

        return ans;
    }
}