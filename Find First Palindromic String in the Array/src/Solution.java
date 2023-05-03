class Solution {
    public String firstPalindrome(String[] words) {

        for(String word : words){

            StringBuilder builder = new StringBuilder(word);
            if(word.contentEquals(builder.reverse()))
                return word;
        }

        return "";
    }
}