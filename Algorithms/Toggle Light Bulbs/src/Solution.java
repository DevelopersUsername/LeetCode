import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {

        List<Integer> ans = new ArrayList<>();

        boolean[] switches = new boolean[101];

        for (Integer bulb : bulbs)
            switches[bulb] = !switches[bulb];
        for (int i = 0; i < switches.length; i++)
            if (switches[i]) ans.add(i);

        return ans;
    }
}