package rev;

import java.util.LinkedList;
//user defined hashset
class MyHashset<T> {
    private final int SIZE = 16; // size of hash table (can be increased)
    private LinkedList<T>[] buckets;

    // Constructor
    public MyHashset() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int getIndex(T key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    public void add(T key) {
        int index = getIndex(key);
        if (!buckets[index].contains(key)) {
            buckets[index].add(key);
        }
    }

    public void remove(T key) {
        int index = getIndex(key);
        buckets[index].remove(key);
    }

    public boolean contains(T key) {
        int index = getIndex(key);
        return buckets[index].contains(key);
    }

    public void print() {
        System.out.println("Contents of MyHashSet:");
        for (LinkedList<T> bucket : buckets) {
            for (T key : bucket) {
                System.out.print(key + " ");
            }
        }
        System.out.println();
    }
}
