import java.util.*;

class Solution {

    private static final Set<String> validCategories = new HashSet<>(Arrays.asList("electronics", "grocery", "pharmacy", "restaurant"));

    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        List<String> electronics = new ArrayList<>();
        List<String> grocery = new ArrayList<>();
        List<String> pharmacy = new ArrayList<>();
        List<String> restaurant = new ArrayList<>();

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < code.length; i++)
            if (isActive[i] && validCategories.contains(businessLine[i]) && isValidCode(code[i]))
                switch (businessLine[i]) {
                    case "electronics":
                        electronics.add(code[i]);
                        break;
                    case "grocery":
                        grocery.add(code[i]);
                        break;
                    case "pharmacy":
                        pharmacy.add(code[i]);
                        break;
                    case "restaurant":
                        restaurant.add(code[i]);
                        break;
                }

        if (!electronics.isEmpty()) {
            Collections.sort(electronics);
            ans.addAll(electronics);
        }

        if (!grocery.isEmpty()) {
            Collections.sort(grocery);
            ans.addAll(grocery);
        }

        if (!pharmacy.isEmpty()) {
            Collections.sort(pharmacy);
            ans.addAll(pharmacy);
        }

        if (!restaurant.isEmpty()) {
            Collections.sort(restaurant);
            ans.addAll(restaurant);
        }

        return ans;
    }

    private static boolean isValidCode(String code) {

        if (code.isEmpty()) return false;

        for (char c : code.toCharArray())
            if (!Character.isLetter(c) && !Character.isDigit(c) && c != '_') return false;

        return true;
    }
}