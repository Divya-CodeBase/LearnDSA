package HashTable;

import java.util.Arrays;

public class DesignHashTable {
    private boolean[] mp = new boolean[1000000];

    public DesignHashTable() {
        mp = new boolean[1000000];
        Arrays.fill(mp, false);
    }

    public void add(int key) {
        mp[key] = true;

    }

    public void remove(int key) {
        mp[key] = false;

    }

    public boolean contains(int key) {
        return mp[key];

    }


    public static void main(String args[]) {

        DesignHashTable obj = new DesignHashTable();
        obj.add(3);
        obj.remove(3);
        boolean param_3 = obj.contains(2);
    }
}
