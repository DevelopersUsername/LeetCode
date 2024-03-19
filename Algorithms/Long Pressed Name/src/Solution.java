class Solution {
    public boolean isLongPressedName(String name, String typed) {

        if (name.equals(typed)) return true;
        else if (typed.length() <= name.length()) return false;

        int counter = 0;
        for (int i = 0; i < typed.length(); i++)
            if (counter < name.length() && name.charAt(counter) == typed.charAt(i)) counter++;
            else if (i == 0 || typed.charAt(i) != typed.charAt(i - 1)) return false;

        return counter == name.length();
    }
}