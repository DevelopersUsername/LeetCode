class Solution {
    public int maxDifference(String s) {

        int maxOdd = 0, minEven = 100;
        int[] chars = new int[26];

        for (char c : s.toCharArray())
            chars[c - 'a']++;
        for (int c : chars)
            if (c == 0) continue;
            else if (c % 2 == 0) minEven = Math.min(minEven, c);
            else maxOdd = Math.max(maxOdd, c);

        return maxOdd - minEven;
    }
}