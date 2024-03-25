import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {

        /*
6 2 5 2
100 500 1001
100 500 1002
101 500 1002
102 500 1001
102 500 1002
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        Map<Integer, Map<Integer, Set<Integer>>> events = new HashMap<>(N);
        for (int i = 0; i < E; i++) {

            st = new StringTokenizer(br.readLine());
            int C = Integer.parseInt(st.nextToken());
            int A = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            events.putIfAbsent(A, new HashMap<>());
            Map<Integer, Set<Integer>> valueMap = events.get(A);
            valueMap.putIfAbsent(V, new HashSet<>());
            valueMap.get(V).add(C);
        }

        Set<Integer> visited = new HashSet<>();
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (Map<Integer, Set<Integer>> event : events.values()) {
            for (Set<Integer> clients : event.values()) {
                for (int client : clients) {

                    graph.putIfAbsent(client, new HashSet<>());
                    for (int otherClient : clients) {
                        if (client != otherClient) {

                            if (getCommonAttributes(client, otherClient, events) >= T) {
                                graph.get(client).add(otherClient);
                            }
                        }
                    }
                }
            }
        }

        visited.clear();
        List<Integer> largestGroup = new ArrayList<>();
        for (int client : graph.keySet()) {
            if (visited.contains(client)) continue;

            List<Integer> currentGroup = new ArrayList<>();
            Queue<Integer> queue = new LinkedList<>();
            queue.add(client);
            visited.add(client);

            while (!queue.isEmpty()) {
                int current = queue.poll();
                currentGroup.add(current);

                for (int neighbor : graph.get(current)) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.add(neighbor);
                    }
                }
            }

            if (currentGroup.size() > largestGroup.size()) {
                largestGroup = currentGroup;
            } else if ((currentGroup.size() == largestGroup.size())) {
                Collections.sort(currentGroup);
                Collections.sort(largestGroup);
                largestGroup = getMin(currentGroup, largestGroup);
            }
        }

        Collections.sort(largestGroup);
        StringBuilder builder = new StringBuilder(largestGroup.size());
        for (Integer i : largestGroup) builder.append(i).append(" ");

        System.out.println(builder);
    }

    private static List<Integer> getMin(List<Integer> currentGroup, List<Integer> largestGroup) {

        boolean flag = false;
        for (int i = 0; i < currentGroup.size(); i++) {
            if (currentGroup.get(i) != largestGroup.get(i)) {
                if (currentGroup.get(i) < largestGroup.get(i)) flag = true;
                break;
            }
        }

        return flag ? currentGroup : largestGroup;
    }

    private static int getCommonAttributes(Integer client1, Integer client2, Map<Integer, Map<Integer, Set<Integer>>> events) {

        int count = 0;
        for (Map<Integer, Set<Integer>> event : events.values())
            for (Set<Integer> clients : event.values())
                if (clients.contains(client1) && clients.contains(client2)) count++;

        return count;
    }
}