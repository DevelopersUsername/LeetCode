import java.util.LinkedList;
import java.util.List;

class Solution {
    public int calPoints(String[] operations) {

        int ans = 0, res;
        List<Integer> prev = new LinkedList<>();

        for (String operation : operations) {

            switch (operation) {
                case "+":
                    res = prev.get(prev.size() - 1) + prev.get(prev.size() - 2);
                    prev.add(res);
                    break;
                case "D":
                    res = prev.get(prev.size() - 1) * 2;
                    prev.add(res);
                    break;
                case "C":
                    res = -prev.get(prev.size() - 1);
                    prev.remove(prev.size() - 1);
                    break;
                default:
                    res = Integer.parseInt(operation);
                    prev.add(res);
            }

            ans += res;
        }

        return ans;
    }
}