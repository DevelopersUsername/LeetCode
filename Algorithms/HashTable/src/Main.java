import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashTable table = new HashTable();

        int count = Integer.parseInt(st.nextToken());
        for (int i = 0; i < count; i++) {

            st = new StringTokenizer(br.readLine());
            String val = String.valueOf(st.nextToken());
            if (val.equals("put")) table.put(st.nextToken(), st.nextToken());
            else if (val.equals("get")) table.get(st.nextToken());
            else table.print();
        }
    }

    public static class HashTable {

        private static final int M = 31;
        private static final float loadFactor = 0.75f;
        private static int capacity = 4;
        private static int size = 0;
        private static LinkedList[] table;

        public HashTable() {
            table = new LinkedList[capacity];
        }

        public void put(String key, String value) {

            int index = (int) (hash(key) % capacity);
            Node node = new Node(key, value);

            if (table[index] == null) {
                table[index] = new LinkedList<>();
                table[index].add(node);
                size++;
            } else {
                LinkedList linkedList = table[index];
                Iterator<Node> iterator = linkedList.iterator();
                boolean flag = false;

                while (iterator.hasNext()) {
                    Node existingNode = iterator.next();

                    if (existingNode.getKey().equals(key)) {
                        existingNode.setValue(value);
                        flag = true;
                        break;
                    }
                }

                if (!iterator.hasNext() && !flag) {
                    table[index].add(node);
                    size++;
                }
            }

            if (size >= capacity * loadFactor) {
                resize();
            }
        }

        public void resize() {

            capacity *= 2;
            LinkedList<Node>[] oldTable = table;
            table = new LinkedList[capacity];

            for (LinkedList<Node> linkedList : oldTable) {
                if (linkedList != null && !linkedList.isEmpty()) {

                    for (int i = linkedList.size() - 1; i >= 0; i--) {

                        Node node = linkedList.get(i);
                        int index = (int) (hash(node.getKey()) % capacity);

                        if (table[index] == null)
                            table[index] = new LinkedList<>();

                        table[index].add(node);
                    }
                }
            }
        }

        public void get(String key) {

            int index = (int) (hash(key) % capacity);
            Node node = null;

            if (table[index] != null) {
                LinkedList<Node> linkedList = table[index];
                for (Node currNode : linkedList) {

                    if (currNode.getKey().equals(key)) {
                        node = currNode;
                        break;
                    }
                }

                if (node != null) {
                    System.out.println("+" + node.getValue());
                    return;
                }
            }

            System.out.println("-");
        }

        public void print() {

            System.out.println(size + " " + capacity);
            for (LinkedList<Node> linkedList : table) {
                if (linkedList != null) {

                    StringBuilder builder = new StringBuilder();
                    for (Node node : linkedList)
                        builder.append('\t').append(node.getKey()).append(" ").append(node.getValue());
                    System.out.println(builder);
                } else System.out.println("");
            }
        }

        public static long hash(String str) {

            long hashCode = 0L;
            for (int i = 0; i < str.length(); i++)
                hashCode = hashCode * M + (str.charAt(i) - 33);

            return hashCode;
        }
    }

    static class Node {
        private final String key;
        private String value;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return this.key;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}