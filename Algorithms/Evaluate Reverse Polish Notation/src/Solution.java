class Solution {
    private int n;

    public int evalRPN(String[] tokens) {

        n = tokens.length - 1;

        return operation(tokens);
    }

    public int operation(String[] tokens) {

        String operation = tokens[n--];
        int val1, val2;

        switch (operation) {
            case "*":
                val2 = operation(tokens);
                val1 = operation(tokens);
                return val1 * val2;
            case "/":
                val2 = operation(tokens);
                val1 = operation(tokens);
                return val1 / val2;
            case "-":
                val2 = operation(tokens);
                val1 = operation(tokens);
                return val1 - val2;
            case "+":
                val2 = operation(tokens);
                val1 = operation(tokens);
                return val1 + val2;
            default:
                return Integer.parseInt(operation);
        }
    }
}