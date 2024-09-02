class Solution {
    public boolean equalFrequency(String word) {

        int[] freq = new int[26];
        for (char c : word.toCharArray())
            freq[c - 'a']++;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) continue;

            freq[i]--;
            if (check(freq)) return true;
            else freq[i]++;
        }

        return false;
    }

    private static boolean check(int[] freq) {

        int min = 101, max = 0;
        for (int elem : freq) {
            if (elem > 0) {
                min = Math.min(min, elem);
                max = Math.max(max, elem);
            }
        }

        return min == max;
    }
}