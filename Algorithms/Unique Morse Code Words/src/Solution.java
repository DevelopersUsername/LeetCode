import java.util.HashMap;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        HashMap<String, Integer> map = new HashMap<>();
        String[] MorseCode = getMorseCode();

        for (String word : words) {

            StringBuilder builder = new StringBuilder();
            for (char c : word.toCharArray()) {
                builder.append(MorseCode[c - 'a']);
            }

            map.putIfAbsent(builder.toString(), 1);
        }

        return map.size();
    }

    private String[] getMorseCode() {
        return new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    }
}