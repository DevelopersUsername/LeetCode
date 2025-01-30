import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> removeAnagrams(String[] words) {

        List<String> ans = new ArrayList<>();
        int n = words.length;

        for (int a = 0; a < n;) {

            int b = a + 1;
            while (b < n && isAnagram(words[a], words[b]))
                b++;
            ans.add(words[a]);

            a = b;
        }

        return ans;
    }

    private static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) return false;

        int[] count = new int[26];
        for (char c : a.toCharArray())
            count[c - 'a']++;

        for (char c : b.toCharArray())
            count[c - 'a']--;

        for (int i = 0; i < 26; i++)
            if (count[i] > 0)
                return false;

        return true;
    }
}