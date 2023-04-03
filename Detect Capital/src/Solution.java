class Solution {
    public boolean detectCapitalUse(String word) {

        int upper = 0, lower = 0;
        for (Character c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upper++;
            } else
                lower++;
        }

        return upper == word.length() || lower == word.length() ||
            (Character.isUpperCase(word.charAt(0)) && lower == word.length() - 1);
    }

    private boolean detectCapitalUseRegex(String word) {
        return word.matches("([A-Z]+\\b)|([a-z]+\\b)|(^[A-Z][a-z]+\\b)");
    }

    private boolean detectCapitalUseEquals(String word) {
        return word.matches("([A-Z]+\\b)|([a-z]+\\b)|(^[A-Z][a-z]+\\b)");
    }
}
