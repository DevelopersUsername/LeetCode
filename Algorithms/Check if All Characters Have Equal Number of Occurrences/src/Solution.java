class Solution {
    public boolean areOccurrencesEqual(String s) {

        int max = 0;
        int[] t = new int[26];
        for (int i = 0; i < s.length(); i++) {
            max = Math.max(max, ++t[s.charAt(i)-'a']);
        }

        for (int e : t) {
            if (e != 0 && e != max)
                return false;
        }

        return true;
    }
}