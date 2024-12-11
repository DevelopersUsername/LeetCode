class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {

        String ans = "0000000000000000";
        int[] count = new int[26];
        for (char c : licensePlate.toCharArray()) {
            int index = Character.toLowerCase(c) - 'a';
            if (index >= 0 && index < 26)
                count[index]++;
        }

        for (String word : words) {

            boolean found = true;
            int[] temp = new int[26];
            for (char c : word.toCharArray())
                temp[c - 'a']++;

            for (int i = 0; i < count.length; i++)
                if (count[i] > 0 && count[i] > temp[i]) {
                    found = false;
                    break;
                }

            if (found && ans.length() > word.length())
                ans = word;
        }

        return ans;
    }
}