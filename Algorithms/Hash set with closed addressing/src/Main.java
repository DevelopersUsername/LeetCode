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
            switch (val) {
                case "add" -> table.add(st.nextToken());
                case "remove" -> table.remove(st.nextToken());
                case "contains" -> table.contains(st.nextToken());
                default -> table.print();
            }
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

        public void add(String value) {

            int index = (int) (hash(value) % capacity);
            Node node = new Node(value);

            if (table[index] == null) {
                LinkedList<Node> linkedList = new LinkedList<>();
                linkedList.add(node);
                table[index] = linkedList;
                size++;
            } else if (get(value, false) == null) {
                LinkedList<Node> linkedList = table[index];
                linkedList.add(node);
                size++;
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
                        int index = (int) (hash(node.getValue()) % capacity);

                        if (table[index] == null)
                            table[index] = new LinkedList<>();

                        table[index].add(node);
                    }
                }
            }
        }

        public void contains(String value) {
            if (get(value, false) != null) System.out.println("+");
            else System.out.println("-");
        }
        public void remove(String value) {
            get(value, true);
        }
        public Node get(String value, boolean remove) {

            int index = (int) (hash(value) % capacity);
            Node node = null;

            if (table[index] != null) {
                LinkedList<Node> linkedList = table[index];
                for (Node currNode : linkedList) {

                    if (currNode.getValue().equals(value)) {

                        node = currNode;
                        if (remove) {
                            linkedList.remove(node);
                            size--;
                        }

                        break;
                    }
                }
            }

            return node;
        }

        public void print() {

            System.out.println(size + " " + capacity);
            for (LinkedList<Node> linkedList : table) {
                if (linkedList != null) {
                    StringBuilder builder = new StringBuilder();
                    for (Node node : linkedList)
                        builder.append(" ").append(node.getValue());
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
        private String value;

        public Node(String value) {
            this.value = value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}