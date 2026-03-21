import java.util.ArrayList;
import java.util.List;

class Solution {

    private int patternLength;
    public List<Boolean> camelMatch(String[] queries, String pattern) {

        patternLength = pattern.length();
        List<Boolean> ans = new ArrayList<>();
        for (String query : queries)
            ans.add(isMatch(query, pattern));

        return ans;
    }

    private Boolean isMatch(String query, String pattern) {

        if (query.length() < patternLength)
            return false;

        int count = 0;
        for (char c : query.toCharArray())
            if (count < patternLength && c == pattern.charAt(count)) count++;
            else if (Character.isUpperCase(c)) return false;

        return count == patternLength;
    }
}