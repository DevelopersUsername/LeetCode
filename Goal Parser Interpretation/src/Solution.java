class Solution {
    public String interpret(String command) {

        if (command.length() == 0)
            return "";

        StringBuilder str = new StringBuilder();
        char prev = command.charAt(0);

        for (int i = 0; i < command.length(); i++) {

            if (prev == '(' && command.charAt(i) == ')') {
                str.append("o");
            } else if (command.charAt(i) != '(' && command.charAt(i) != ')') {
                str.append(command.charAt(i));
            }

            prev = command.charAt(i);
        }

        return str.toString();
    }
}