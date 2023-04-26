class Solution {
    public boolean checkIfPangram(String sentence) {

        if(sentence.length() < 26)
            return false;

        for(char ch = 'a'; ch <= 'z'; ch++){
            if (!sentence.contains(String.valueOf(ch)))
                return false;
        }

        return true;
    }
}