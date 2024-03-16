import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static Set<Integer> visited = new HashSet<>();
    static Map<Integer, Set<Integer>> graph = new HashMap<>();
    static int minPath = Integer.MAX_VALUE;
    static boolean flag = true;
    static int ans = 0, A, B, C;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        for (int i = 0; i < count; i++) {

            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            initGraph(from, to);
            initGraph(to, from);
        }


        bfs(A, B, 0);
        ans += minPath;
        flag = false;

        visited.clear();
        minPath = Integer.MAX_VALUE;

        bfs(B, C, 0);

        System.out.println(Math.max(-1, ++ans + minPath));
    }

    private static void bfs(int start, int end, int path) {

        if (visited.contains(start)) return;
        if (flag && start == C) return;
        if (start == end) {
            minPath = Math.min(path, minPath);
            return;
        }

        visited.add(start);
        for (Integer elem : graph.get(start)) {
            bfs(elem, end, path + 1);
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