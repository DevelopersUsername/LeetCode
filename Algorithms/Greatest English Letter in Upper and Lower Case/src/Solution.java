class Solution {
    public String greatestLetter(String s) {

        for (int i = 90; i >= 64; i--)
            if (s.indexOf(i) != -1 && s.indexOf(i + 32) != -1)
                return String.valueOf((char) i);

        return "";
    }
}