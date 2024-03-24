import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        Graph graph = new Graph(V);

        for (int i = 0; i < E; i++) {

            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph.addEdge(from, to, cost);
        }

        int[] distances = graph.dijkstra(S);

        System.out.println(distances[T] == Integer.MAX_VALUE ? -1 : distances[T]);
    }

    static class Graph {
        private final Map<Integer, List<Node>> adjacencyList;

        public Graph(int vertices) {
            adjacencyList = new HashMap<>();
            for (int i = 0; i < vertices; i++) {
                adjacencyList.put(i, new ArrayList<>());
            }
        }

        public void addEdge(int from, int to, int weight) {
            adjacencyList.get(from).add(new Node(to, weight));
        }

        public  int[] dijkstra(int startVertex) {
            int[] distances = new int[adjacencyList.size()];
            Arrays.fill(distances, Integer.MAX_VALUE);
            distances[startVertex] = 0;

            PriorityQueue<Node> minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
            minHeap.add(new Node(startVertex, 0));

            while (!minHeap.isEmpty()) {
                Node current = minHeap.poll();
                int vertex = current.vertex;

                for (Node edge : adjacencyList.get(vertex)) {
                    int targetVertex = edge.vertex;
                    int weight = edge.weight;

                    int distanceThroughVertex = distances[vertex] + weight;
                    if (distanceThroughVertex < distances[targetVertex]) {
                        distances[targetVertex] = distanceThroughVertex;
                        minHeap.add(new Node(targetVertex, distances[targetVertex]));
                    }
                }
            }

            return distances;
        }
    }

    static class Node implements Comparable<Node> {
        int vertex;
        int weight;

        public Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.weight, other.weight);
        }
    }
}