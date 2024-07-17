package HashTable;

import java.util.Arrays;

public class DesignHashSet {

    int[] ms;

    public DesignHashSet() {
        ms = new int[1000001];
        Arrays.fill(ms, -1);
    }

    public void put(int key, int value) {
        ms[key] = value;

    }

    public int get(int key) {
        return ms[key];
    }

    public void remove(int key) {
        ms[key] = -1;

    }
}
