import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        Map<Character, Integer> hashS= new HashMap();
        Map<Character, Integer> hashT= new HashMap();

        for (int i = 0; i < s.length(); i++) {
            if (hashS.putIfAbsent(s.charAt(i), i) != hashT.putIfAbsent(t.charAt(i), i))
                return false;
        }

        return true;
    }
}