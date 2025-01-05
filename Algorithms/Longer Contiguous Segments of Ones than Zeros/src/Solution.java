class Solution {
    public boolean checkZeroOnes(String s) {

        int ones = 0, zeros = 0, maxOnes = 0, maxZeros = 0;

        for (char c : s.toCharArray())
            if (c == '0') {
                zeros++;
                maxOnes = Math.max(maxOnes, ones);
                ones = 0;
            } else {
                ones++;
                maxZeros = Math.max(maxZeros, zeros);
                zeros = 0;
            }

        maxOnes = Math.max(maxOnes, ones);
        maxZeros = Math.max(maxZeros, zeros);

        return maxOnes > maxZeros;
    }
}