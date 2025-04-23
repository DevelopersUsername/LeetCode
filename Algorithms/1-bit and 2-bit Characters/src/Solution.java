class Solution {
    public boolean isOneBitCharacter(int[] bits) {

        int pos = 0, n = bits.length - 1;
        while (pos < n)
            if (bits[pos++] == 1) pos++;

        return pos == n;
    }
}