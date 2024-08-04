package Grind75;

import java.util.*;

public class UniqueNumberofOccurrences {
    public static void main(String args[]) {
        System.out.println(uniqueOccurrences(new int[]{1,2}));
    }

    public static boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : arr) {
            if (mp.containsKey(i)) {
                mp.put(i, mp.get(i) + 1);
            } else {
                mp.put(i, 1);
            }
        }

        List<Integer> lt = new ArrayList<>(mp.values());

        Set<Integer> s = new HashSet<>();
        for (int n : lt) {
            if (!s.add(n)) {
                return false;
            }
        }

        return true;
    }
}
