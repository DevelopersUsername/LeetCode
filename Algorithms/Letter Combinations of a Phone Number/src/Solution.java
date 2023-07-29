import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    private static final Map<Character, List<Character>> buttons = new HashMap<>();

    public Solution() {
        buttons.put('2', List.of('a', 'b', 'c'));
        buttons.put('3', List.of('d', 'e', 'f'));
        buttons.put('4', List.of('g', 'h', 'i'));
        buttons.put('5', List.of('j', 'k', 'l'));
        buttons.put('6', List.of('m', 'n', 'o'));
        buttons.put('7', List.of('p', 'q', 'r', 's'));
        buttons.put('8', List.of('t', 'u', 'v'));
        buttons.put('9', List.of('w', 'x', 'y', 'z'));
    }

    public List<String> letterCombinations(String digits) {

        if (digits.isEmpty()) return new ArrayList<>();

        List<String> ans = new ArrayList<>();
        combination(ans, digits, 0, new StringBuilder());

        return ans;
    }

    private void combination(List<String> ans, String digits, int counter, StringBuilder builder) {

        if (digits.length() == counter) ans.add(builder.toString());
        else {
            for (char letter : buttons.get(digits.charAt(counter))) {
                builder.append(letter);
                combination(ans, digits, counter + 1, builder);
                builder.deleteCharAt(builder.length() - 1);
            }
        }
    }
}