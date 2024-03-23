import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        TreeMap<Integer, PriorityQueue<Integer>> map = new TreeMap<>();

        int count = Integer.parseInt(st.nextToken());
        for (int i = 0; i < count; i++) {

            st = new StringTokenizer(br.readLine());
            int id = Integer.parseInt(st.nextToken());
            if (id == -1) map.get(queue.poll()).remove();
            else {
                int rank = Integer.parseInt(st.nextToken());
                queue.add(rank);

                if (map.containsKey(rank)) map.get(rank).add(id);
                else {
                    PriorityQueue<Integer> pq = new PriorityQueue<>();
                    pq.add(id);
                    map.put(rank, pq);
                }
            }
        }

        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Integer, PriorityQueue<Integer>> entrySet : map.entrySet())
            for (Integer id : entrySet.getValue())
                builder.append(id).append(" ");

        System.out.println(builder);
    }
}