class Solution {
    public String reverseByType(String s) {

        int n = s.length();
        StringBuilder ans = new StringBuilder(n), letters = new StringBuilder(), specialCharacters =  new StringBuilder();

        char[] arr = s.toCharArray();
        for (char c : arr)
            if (Character.isLetter(c)) letters.append(c);
            else specialCharacters.append(c);

        int lettIndex = letters.length() - 1, specIndex = specialCharacters.length() - 1;

        for (char c : arr)
            if (Character.isLetter(c)) ans.append(letters.charAt(lettIndex--));
            else ans.append(specialCharacters.charAt(specIndex--));

        return  ans.toString();
    }
}