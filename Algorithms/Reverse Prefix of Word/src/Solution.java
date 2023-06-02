class Solution {
    public String reversePrefix(String word, char ch) {

        StringBuilder ans = new StringBuilder();
        for (int i = word.indexOf(ch); i >= 0; i--) {
            ans.append(word.charAt(i));
        }

        ans.append(word.substring(word.indexOf(ch) + 1));

        return ans.toString();
    }
}