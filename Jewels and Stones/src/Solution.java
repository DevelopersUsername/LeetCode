import java.util.HashMap;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : stones.toCharArray())
            map.put(c, map.getOrDefault(c,0) + 1);

        for(char c : jewels.toCharArray())
            result += map.getOrDefault(c,0);

        return result;
    }
}