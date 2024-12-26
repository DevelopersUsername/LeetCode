class Solution {
    public boolean strongPasswordCheckerII(String password) {

        if (password.length() < 8) return false;

        boolean lowercase = false, uppercase = false, digit = false, special = false;
        char prev = ' ';

        for (char c : password.toCharArray()) {

            if (c == prev) return false;
            if (Character.isLowerCase(c)) lowercase = true;
            else if (Character.isUpperCase(c)) uppercase = true;
            else if (Character.isDigit(c)) digit = true;
            else special = true;

            prev = c;
        }

        return lowercase && uppercase && digit && special;
    }
}