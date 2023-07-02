import java.util.ArrayList;

class Solution {

    private static final String VOWELS = "aeiouAEIOU";

    public String reverseVowels(String s) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {

            if (isInVowelsString(s.charAt(i)))
                list.add(s.charAt(i));
        }

        if (list.isEmpty())
            return s;

        int counter = list.size() - 1;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            if (isInVowelsString(s.charAt(i)))
                ans.append(list.get(counter--));
            else
                ans.append(s.charAt(i));
        }

        return ans.toString();
    }

    boolean isInVowelsString(char c) {
        return VOWELS.indexOf(c) != -1;
    }
}