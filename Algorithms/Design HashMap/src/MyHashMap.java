import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyHashMap {

    private final int capacity;
    private final List<List<int[]>> map;

    public MyHashMap() {
        this.capacity = 1000;
        map = new ArrayList<>(capacity);

        for (int i = 0; i < capacity; i++)
            map.add(new LinkedList<>());
    }

    public void put(int key, int value) {

        for (int[] keys : map.get(key % capacity))
            if (keys[0] == key) {
                keys[1] = value;
                return;
            }

        map.get(key % capacity).add(new int[]{key, value});
    }

    public int get(int key) {

        for (int[] keys : map.get(key % capacity))
            if (keys[0] == key)
                return keys[1];

        return -1;
    }

    public void remove(int key) {

        for (int[] keys : map.get(key % capacity))
            if (keys[0] == key) {
                map.get(key % capacity).remove(keys);
                break;
            }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */