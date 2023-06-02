import java.util.HashMap;
import java.util.Map;

class Solution {
    public String decodeMessage(String key, String message) {

        StringBuilder sb = new StringBuilder();
        Map<Character,Character> decode = new HashMap<>();
        decode.put(' ', ' ');

        char value = 'a';
        for(int i = 0; i < key.length(); i++){

            char t = key.charAt(i);
            if(t != ' ' && decode.get(t) == null)
                decode.putIfAbsent(t, value++);
        }

        for (int i = 0; i < message.length(); i++)
            sb.append(decode.get(message.charAt(i)));

        return sb.toString();
    }
}