public class Main {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(9);
        myHashSet.remove(19);
        myHashSet.add(14);
        myHashSet.remove(19);
        myHashSet.remove(9);
        myHashSet.add(0);
        myHashSet.add(3);
        myHashSet.add(4);
        myHashSet.add(0);
        myHashSet.remove(9);
    }
}