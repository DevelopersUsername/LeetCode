class MyHashSet {

    boolean[] arr;

    public MyHashSet() {
        this.arr = new boolean[0];
    }

    private void addCapacity(int key) {
        boolean[] t = new boolean[key + 1];
        System.arraycopy(arr, 0, t, 0, arr.length);
        arr = t;
    }

    public void add(int key) {

        if (key > arr.length - 1)
            addCapacity(key);

        arr[key] = true;
    }

    public void remove(int key) {
        if (key < arr.length)
            arr[key] = false;
    }

    public boolean contains(int key) {
        return key < arr.length && arr[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */