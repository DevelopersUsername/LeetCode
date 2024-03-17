import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static Set<Integer> visited = new TreeSet<>();
    static Map<Integer, Set<Integer>> graph = new HashMap<>();
    static boolean loopFound = false;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        for (int i = 0; i < count; i++) {

            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            initGraph(from, to);
            initGraph(to, from);
        }

        for (Map.Entry<Integer, Set<Integer>> entry : graph.entrySet()) {

            for (Integer val : entry.getValue()) {
                dfs(entry.getKey(), entry.getKey(), val);
                if (loopFound) break;
            }

            if (loopFound) break;
            else visited.clear();
        }

        if (loopFound) {
            StringBuilder builder = new StringBuilder(visited.size());
            for (Integer v : visited) builder.append(v).append(" ");
            System.out.println(builder);
        } else System.out.println(-1);
    }

    private static void dfs(int start, int from, int to) {

        if (loopFound) return;
        if (visited.contains(to)) return;
        if (start == to) {
            loopFound = true;
            visited.add(to);
            return;
        }

        for (Integer e : graph.get(to)) {
            if (from != e) {
                visited.add(to);
                dfs(start, to, e);
            }
        }
    }

    private static void initGraph(int from, int to) {

        if (!graph.containsKey(from)) {
            Set<Integer> set = new HashSet<>();
            set.add(to);
            graph.put(from, set);
        } else graph.get(from).add(to);
    }
}

/*
11
3 4
3 5
3 6
3 7
7 8
8 10
10 11
11 12
13 14
13 12
13 3
 */