import java.util.ArrayList;
import java.util.List;

class Solution {
    public String reformat(String s) {

        List<Character> digits = new ArrayList<>(), letters = new ArrayList<>();
        for (char c : s.toCharArray())
            if (Character.isDigit(c))
                digits.add(c);
            else letters.add(c);

        if (Math.abs(digits.size() - letters.size()) > 1) return "";

        StringBuilder ans = new StringBuilder();
        int i = 0, d = digits.size(), l = letters.size();
        if (d > l) {
            while (i < l)
                ans.append(digits.get(i)).append(letters.get(i++));
            ans.append(digits.get(d - 1));
        } else {
            while (i < d)
                ans.append(letters.get(i)).append(digits.get(i++));
            if (d != l) ans.append(letters.get(l - 1));
        }

        return ans.toString();
    }
}