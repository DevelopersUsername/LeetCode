import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String predictPartyVictory(String senate) {

        Queue<Integer> queueRadiant = new LinkedList<>();
        Queue<Integer> queueDire = new LinkedList<>();

        for (int i = 0; i < senate.length(); i++)
            if (senate.charAt(i) == 'R') queueRadiant.add(i);
            else queueDire.add(i);

        while (!queueRadiant.isEmpty() && !queueDire.isEmpty()) {

            int indexRadiant = queueRadiant.element();
            int indexDire = queueDire.element();

            queueRadiant.poll();
            queueDire.poll();

            if (indexRadiant < indexDire) queueRadiant.add(indexRadiant + senate.length());
            else queueDire.add(indexDire + senate.length());
        }

        return queueRadiant.isEmpty() ? "Dire" : "Radiant";
    }
}