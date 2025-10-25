class Solution {
    public String majorityFrequencyGroup(String s) {

        StringBuilder ans = new StringBuilder();
        int[] count = new int[26], freq = new int[101];
        int maxFreq = 0, majorityFreq = -1;

        for (char c : s.toCharArray()) count[c - 'a']++;
        for (int c : count) if (c != 0) freq[c]++;
        for (int i = 0; i < freq.length; i++)
            if (freq[i] != 0 && freq[i] >= maxFreq) {
                maxFreq = freq[i];
                majorityFreq = i;
            }
        for (int i = 0; i < count.length; i++)
            if (count[i] == majorityFreq) ans.append((char) (i + 'a'));

        return ans.toString();
    }
}